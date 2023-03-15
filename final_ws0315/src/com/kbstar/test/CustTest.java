package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImple;

public class CustTest {

	public static void main(String[] args) {
		
		
		
//		CRUDService<String, Cust> crudService = new CustCRUDServiceImple();
//		 Cust cust = new Cust("ididid000", "pwd02", "기현", "gihyun@kbstar.com","010123111");
//		try {
//			crudService.register(cust);
//			System.out.println(cust);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//	
//		}

		
		
		
//		CRUDService<String, Cust> custService =
//				new CustCRUDServiceImple();
//		
//		try {
//			custService.remove("ididid000");
//			System.out.println("성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
		
		
//		CRUDService<String, Cust> crudService = new CustCRUDServiceImple();
//
//		Cust cust= null;
//		try {
//
//			cust =crudService.get("ididid0");
//			System.out.println(cust);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
		
		
//		CRUDService<String, Cust> crudService = new CustCRUDServiceImple();
//
//		List<Cust>  list= null;
//		try {
////			System.out.println(crudService.get("id06"));
//			list =crudService.get();
//			
//			if(list.size()==0) {
//				System.out.println("데이터가 없습니다.");
//		
//			}else {
//			for(Cust obj:list) {
//			System.out.println(obj);
//			}
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
////			e.printStackTrace();
//		}

		
		
		CRUDService<String, Cust> crudService = 
				new CustCRUDServiceImple();
		
		Cust cust = new Cust("id2", "3333", "tom", "aatest@naver.com", "010-5678-1234");
		try {
			crudService.modify(cust);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
}
}