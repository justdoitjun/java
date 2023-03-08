package com.kbstar.app;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class App2 {

	public static void main(String[] args) {
	    HashMap<String, ItemDTO> db = new HashMap<>(); // HashMap 객체를 생성합니다.
		DAO<String, ItemDTO> itemDao = new ItemDAO(db);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Input command(q,i,d,u, s, sa)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}//end of q
			else if(cmd.equals("i")) {
			    System.out.println("ID?");
			    String id = sc.next();
			    System.out.println("name?");
			    String name = sc.next();
			    System.out.println("price?");
			    Double price = Double.parseDouble(sc.next());
			    System.out.println("quant?");
			    int quant = Integer.parseInt(sc.next());
			    
			    // 입력받은 값을 사용하여 ItemDTO 객체를 생성합니다.
			    ItemDTO item = new ItemDTO(id, name, price, quant);
			    
			    try {
			        itemDao.insert(item);
			    } catch(Exception e) {
			        // 예외 처리 코드
			    }
			}
			else if(cmd.equals("d")) {
				System.out.println("ID");
				String id = sc.next();
				try {
				itemDao.delete(id);
				}
				catch(Exception e) {
					
				}
			}// end of d
			else if(cmd.equals("u")) {
				System.out.println("Update?");
				System.out.println("select your id.");
				String id = sc.next();
				System.out.println("Quantity?");
				int quant = Integer.parseInt(sc.next());
				ItemDTO updatedItem = new ItemDTO(id, quant);
				try {
				itemDao.update(updatedItem);
				}
				catch(Exception e) {
					//예외처리 메세지
				}			
			}//end of u
			else if(cmd.equals("s")){
				System.out.println("ID?");
				String id = sc.next();
				ItemDTO selectedItem = null;
				try {
				selectedItem = itemDao.select(id);
				System.out.println(selectedItem);
				}catch(Exception e) {
					//예외처리 메세지
				}
			}//end of s
//			else if(cmd.equals("sa")) {
//				List<UserDTO> list = null;
//				try {
//				list = userDao.select();
//				for(UserDTO x : list) {
//					System.out.println(x);
//				}
//				} catch(Exception e) {
//					
//				}
//			}//end of sa
		}//end of while statement;
		sc.close();

	}

}
