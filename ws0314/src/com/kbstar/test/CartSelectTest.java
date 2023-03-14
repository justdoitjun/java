package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartSelectTest {

	public static void main(String[] args) {

		CRUDService<String, Cart> crudService = new CartCRUDServiceImpl();

		Cart cart = null;
		try {
			cart = crudService.get("0001");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.println(cart);

	}

}