package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.TransactionDAO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

public class TransactionService implements CRUDService<String, TransactionDTO>{

	DAO<String, TransactionDTO> trDao;
	
	public TransactionService() {
		trDao = new TransactionDAO();
	}
	
	@Override
	public void register(TransactionDTO v) throws Exception {
		try {
			trDao.insert(v);
		}catch(Exception e) {
			throw new Exception("거래내역 등록이 실패 하였습니다.(EX0001)");
		}
	}

	@Override
	public void remove(String k) throws Exception {
		
	}

	@Override
	public void modify(TransactionDTO v) throws Exception {
		
	}

	@Override
	public TransactionDTO get(String k) throws Exception {
		TransactionDTO obj = null;
		obj = trDao.select(k);
		return obj;
	}

	@Override
	public List<TransactionDTO> get() throws Exception {
		List<TransactionDTO> list = null;
		list = trDao.select();
		return list;
	}
	
}
