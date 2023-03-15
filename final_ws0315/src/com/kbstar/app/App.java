package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.ShopService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.CustCRUDServiceImpl;
import com.kbstar.service.ItemCRUDServiceImpl;
import com.kbstar.service.ShopServiceImpl;

public class App {
	public static void main(String[] args) {
		//register, login, mycart
		ShopService<Cust, Cart> shopService = new ShopServiceImpl();
		CRUDService<String, Cust> custService = new CustCRUDServiceImpl();
		CRUDService<String, Item> itemService = new ItemCRUDServiceImpl();
		CRUDService<String, Cart> cartService = new CartCRUDServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----   Shop Mall Program -----");
			System.out.println("Login(l) or Register(r) (q) ...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye...");
				break;
			} else if (cmd.equals("r")) {// Register
				System.out.println("Register.. ");
				System.out.println("Input ID.. ");
				String id = sc.next();
				System.out.println("Input PWD.. ");
				String pwd = sc.next();
				System.out.println("Input NAME.. ");
				String name = sc.next();
				Cust cust = new Cust(id, pwd, name, 20);
				try {
					shopService.register(cust);
					System.out.println("환영합니다.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else if (cmd.equals("l")) {// Login
				System.out.println("Login.. ");
				System.out.println("ID를 입력 하세요.. ");
				String id = sc.next();
				System.out.println("PWD를 입력 하세요.. ");
				String pwd = sc.next();
				Cust cust = null;

				try {
					cust = shopService.login(id, pwd);
					System.out.println("로그인 성공");
					System.out.println("----------------------------");
					while (true) {
						System.out.println("Menu(사용자정보조회(c),상품조회(it),카트입력(i),카트조회(ci),나가기(e))...");
						String cmn = sc.next();
						if (cmn.equals("e")) {
							System.out.println("Logout...");
							break;
						} else if (cmn.equals("c")) {
							System.out.println("사용자정보조회...");
							Cust custInfo = null;
							custInfo = custService.get(cust.getId());
							System.out.println(custInfo);
						} else if (cmn.equals("it")) {
							System.out.println("전체 상품조회");
							List<Item> list = null;
							list = itemService.get();
							for(Item el : list) {
								System.out.println(el);
							}
						} else if (cmn.equals("i")) {
							System.out.println("카트입력");
							System.out.println("상품 id 입력");
							String item_id = sc.next();
							System.out.println("수량 입력");
							int cnt = Integer.parseInt(sc.next());
							Cart cart = new Cart(cust.getId(),item_id, cnt);
							cartService.register(cart);
							System.out.println("정상적으로 카트에 담겼습니다.");
							
						} else if (cmn.equals("ci")) {// My Cart
							System.out.println("나의 카트조회...");
							List<Cart> list = null;
							list = shopService.myCart(cust.getId());
							for(Cart el : list) {
								System.out.println(el);
							}
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					// e.printStackTrace();
				}
			}
		}
		sc.close();
	}
}