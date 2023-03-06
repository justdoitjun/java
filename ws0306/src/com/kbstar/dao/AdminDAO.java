package com.kbstar.dao;

import com.kbstar.dto.AdminDTO;
import com.kbstar.frame.DAO;

public class AdminDAO implements DAO<String, AdminDTO>{

	@Override
	public void insert(AdminDTO v) {
		System.out.println(v);
		System.out.println("Inserted..");
	}

	@Override
	public void delete(String k) {
		System.out.println(k);
		System.out.println("Deleted..");		
	}

	@Override
	public void update(AdminDTO v) {
		System.out.println(v);
		System.out.println("Update..");		
	}

}