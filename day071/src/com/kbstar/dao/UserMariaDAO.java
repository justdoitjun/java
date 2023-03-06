package com.kbstar.dao;

import com.kbstar.frame.DAO;

public class UserMariaDAO implements DAO {

	@Override
	public void insert(Object obj) {
		System.out.println(obj);
		System.out.println("Inserted Maria...");
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("Deleted Maria...");
		
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("Updated Maria...");
		
	}

}
