package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartUpdateTest {

	public static void main(String[] args) {

		CRUDService<String, Cart> crudService = new CartCRUDServiceImpl();

		Cart cart = null;
		try {
			cart = new Cart("2023314127100", null, null, 71, null);
			crudService.modify(cart);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("수정완료");

	}

}