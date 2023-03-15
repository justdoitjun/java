package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> service =
				new CartCRUDServiceImpl();
		try {
			Cart obj = new Cart("junTest4","NoNegative", -10);
			service.register(obj);
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
