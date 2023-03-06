package com.kbstar.service;

import com.kbstar.dao.ShopDAO;
import com.kbstar.dto.ShopDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class ShopService implements Service<String, ShopDTO>{

	DAO<String, ShopDTO> dao;
	
	public ShopService() {
		dao = new ShopDAO();
	}
	
	@Override
	public void register(ShopDTO v) {
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
	public void modify(ShopDTO v) {
		dao.update(v);
		System.out.println("Send SMS");		
	}

}