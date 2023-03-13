package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.fraame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class SelectTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService =
				new CustCRUDServiceImpl();
		try {
			crudService.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
