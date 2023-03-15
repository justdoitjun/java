package com.kbstar.test;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;
public class ItemUpdateTest {
	
	public static void main(String[] args) {
		CRUDService<String, Item> Service =
				new ItemCRUDServiceImpl();
		
		Item item = new Item("shirt", 33333, 2.3, "2023314442100");
		try {
			Service.modify(item);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
 }
}