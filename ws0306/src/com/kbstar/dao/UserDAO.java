package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO>{

	@Override
	public void insert(UserDTO v) {
		System.out.println(v);
		System.out.println("Inserted..");
	}

	@Override
	public void delete(String k) {
		System.out.println(k);
		System.out.println("Deleted..");		
	}

	@Override
	public void update(UserDTO v) {
		System.out.println(v);
		System.out.println("Update..");		
	}

}