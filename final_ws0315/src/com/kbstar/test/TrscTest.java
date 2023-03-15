package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Trsc;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.TrscCRUDServiceImpl;

public class TrscTest {

	public static void main(String[] args) {
		CRUDService<String, Trsc> trscService = new TrscCRUDServiceImpl();
		
//		//register TEST
//		Trsc trsc = new Trsc(null, "2023010101", "3023010101", 370000, "I", "테스트비용");
//		try {
//			trscService.register(trsc);
//			System.out.println(trsc);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		//selecet TEST
//		try {
//			Trsc trsc = trscService.get("2023315381100");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		//getAll Test
//		try {
//			List<Trsc> list = trscService.get();
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
	}

}
