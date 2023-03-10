package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class AccountService implements CRUDService<String, AccountDTO>{

	DAO<String, AccountDTO> accDao;
	Notification notification;
	
	public AccountService() {
		accDao = new AccountDAO();
		notification = new NotificationImpl();
	}
	
	@Override
	public void register(AccountDTO v) throws Exception {
		try {
			accDao.insert(v);
		}catch(Exception e) {
			throw new Exception("계좌 생성이 실패 하였습니다.(EX0001)");
		}	
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			accDao.delete(k);
		}catch(Exception e) {
			throw new Exception("계좌 삭제가 실패 하였습니다.(EX0001)");
		}	
	}

	@Override
	public void modify(AccountDTO v) throws Exception {
		try {
			accDao.update(v);
		}catch(Exception e) {
			throw new Exception("계좌 수정이 실패 하였습니다.(EX0001)");
		}	
	}

	@Override
	public AccountDTO get(String k) throws Exception {
		AccountDTO obj = null;
		obj = accDao.select(k);
		return obj;
	}

	@Override
	public List<AccountDTO> get() throws Exception {
		List<AccountDTO> list = null;
		list = accDao.select();
		return list;
	}
	
}
