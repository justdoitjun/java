package com.kbstar.service;

import com.kbstar.dao.AdminDAO;
import com.kbstar.dto.AdminDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class AdminService implements Service<String, AdminDTO>{

	DAO<String, AdminDTO> dao;
	
	public AdminService() {
		dao = new AdminDAO();
	}
	
	@Override
	public void register(AdminDTO v) {
		System.out.println("Security Check");
		dao.insert(v);
		System.out.println("Send SMS");

	}

	@Override
	public void remove(String k) {
		dao.delete(k);
		System.out.println("Send SMS");		
	}

	@Override
	public void modify(AdminDTO v) {
		dao.update(v);
		System.out.println("Send SMS");		
	}

}