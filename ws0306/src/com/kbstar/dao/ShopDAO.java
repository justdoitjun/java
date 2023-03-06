package com.kbstar.dao;

import com.kbstar.dto.ShopDTO;
import com.kbstar.frame.DAO;

public class ShopDAO implements DAO<String, ShopDTO>{

	@Override
	public void insert(ShopDTO v) {
		System.out.println(v);
		System.out.println("Inserted..");
	}

	@Override
	public void delete(String k) {
		System.out.println(k);
		System.out.println("Deleted..");		
	}

	@Override
	public void update(ShopDTO v) {
		System.out.println(v);
		System.out.println("Update..");		
	}

}