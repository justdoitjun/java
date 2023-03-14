package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.ItemCRUDServiceImpl;

public class CartDeleteTest {

public static void main(String[] args) {
		CRUDService<String, Cart> cartService = new CartCRUDServiceImpl();	
		try {
			cartService.remove("202331487410");
			System.out.println("Success!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
