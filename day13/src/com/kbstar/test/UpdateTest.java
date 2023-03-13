package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.fraame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class UpdateTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService =
				new CustCRUDServiceImpl();
		Cust cust = new Cust("id10", "777", "tom", 40);
		try {
			crudService.modify(cust);
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
