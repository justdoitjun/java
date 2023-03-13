package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.fraame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService =
				new CustCRUDServiceImpl();
		Cust cust = new Cust("i23","pwd20","tom",30);
		try {
			crudService.register(cust);
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
