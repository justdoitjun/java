package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO>{

	@Override
	public void insert(ItemDTO v) {
		System.out.println(v);
		System.out.println("Inserted..");
	}

	@Override
	public void delete(Integer k) {
		System.out.println(k);
		System.out.println("Deleted..");		
	}

	@Override
	public void update(ItemDTO v) {
		System.out.println(v);
		System.out.println("Update..");		
	}

}