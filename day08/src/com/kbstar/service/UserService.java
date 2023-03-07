package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class UserService implements Service<String, UserDTO> {
	
	DAO<String,UserDTO> dao;
	
	public UserService() {
		dao = new UserDAO();
	}

	@Override
	public void register(UserDTO v) {
		System.out.println("Security check");
		dao.insert(v);
		System.out.println("Sent mail");
		System.out.println("Sent SMS");
	}

	@Override
	public void remove(String k) {
		dao.remove(k);
		System.out.println("Sent mail");
		
	}

	@Override
	public void delete(String k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserDTO v) {
		// TODO Auto-generated method stub
		
	}

	

}
