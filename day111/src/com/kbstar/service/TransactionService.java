package com.kbstar.service;

import java.util.List;


import com.kbstar.dao.TransactionDAO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.notif.NotificationImpl;

public class TransactionService implements CRUDService<String, TransactionDTO> {

	DAO<String, TransactionDTO> transDao;
	Notification notification;
	
	public TransactionService() {
		transDao = new TransactionDAO();
		notification = new NotificationImpl();
	}
	
	@Override
	public void register(TransactionDTO v) throws Exception {
		try {
			transDao.insert(v);
			//System.out.println(v);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public void remove(String k) throws Exception {
		try {
			transDao.delete(k);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void modify(TransactionDTO v) throws Exception {
		try {
			transDao.update(v);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public TransactionDTO get(String k) throws Exception {
		try {
			TransactionDTO obj = null;
			obj = transDao.select(k);
			return obj;
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}


	@Override
	public List<TransactionDTO> get() throws Exception {
		try {
			List<TransactionDTO> list = null;
			list = transDao.select();
			return list;
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void delete(String k) throws Exception {
		// TODO Auto-generated method stub
		
	}



}