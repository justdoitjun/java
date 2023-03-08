package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

import bank.WeirdException;

public class UserService implements Service<String, UserDTO> {
	
	DAO<String,UserDTO> dao;
	
	public UserService() {
		dao = new UserDAO();
	}

	@Override
	public void register(UserDTO v) throws WeirdException {
		System.out.println("Security check");
		dao.insert(v); 
		// 왜 여긴 try catch를 안 쓸까?
		System.out.println("Sent mail");
		System.out.println("Sent SMS");
	}

	@Override
	public void remove(String k) throws WeirdException {
		dao.remove(k);
		System.out.println("Sent mail");
		
	}

	@Override
	public void delete(String k) throws WeirdException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserDTO v) {
		// TODO Auto-generated method stub
		
	}

	

}
