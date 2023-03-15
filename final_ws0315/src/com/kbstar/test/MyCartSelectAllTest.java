package com.kbstar.test;

import java.util.ArrayList;
import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.frame.ShopService;
import com.kbstar.service.ShopServiceImpl;

public class MyCartSelectAllTest {

	public static void main(String[] args) {
		ShopService<Cust, Cart> service =
				new ShopServiceImpl(); 
		List<Cart> list = new ArrayList<>();
		try {
			list = service.myCart("junTest4");
			if(list.size() == 0) {
				System.out.println("불러올 내용이 없습니다.");
				return;
			}
			int cnt = 0;
			for (Cart el : list) {
				cnt++;
				System.out.printf("%d번째 ",cnt);
				System.out.println(el);
			}
				System.out.println("Success");
				System.out.println("모든 정보를 호출하셨습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
