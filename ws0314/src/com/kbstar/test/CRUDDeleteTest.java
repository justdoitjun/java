package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CRUDDeleteTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService =
				new CustCRUDServiceImpl();
		String k = "id97";
		try {
			crudService.remove(k);
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
