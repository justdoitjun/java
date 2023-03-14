package com.kbstar.test;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Item> service =
				new ItemCRUDServiceImpl();
		Item obj = new Item("jun",20000,3.2);
		try {
			service.register(obj);
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
