package com.kbstar.test;

import java.sql.SQLRecoverableException;
import java.util.ArrayList;
import java.util.List;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemSelectAllTest {

	public static void main(String[] args) {
		CRUDService<String, Item> service =
				new ItemCRUDServiceImpl();
		List<Item> list = new ArrayList<>();
		try {
			list = service.get();
			if(list.size() == 0) {
				System.out.println("불러올 내용이 없습니다.");
				return;
			}
			int cnt = 0;
			for (Item el : list) {
				cnt++;
				System.out.printf("%d번째 ",cnt);
				System.out.println(el);
			}
				System.out.println("Success");
				System.out.println("모든 정보를 호출하셨습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
