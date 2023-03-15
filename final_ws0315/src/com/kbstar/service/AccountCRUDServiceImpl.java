package com.kbstar.service;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.util.ArrayList;
import java.util.List;

import com.kbstar.dao.AccountDAOImpl;
import com.kbstar.dto.Account;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;

public class AccountCRUDServiceImpl implements CRUDService<String, Account>{
	DAO<String, String, Account> dao; 
	// 집에서 다시 봐야할 점. 인터페이스에는 클래스와 다르게 null 초기화 처리가 필요없는가?
	// 그 이유가 무엇인지? 찾아봐야함.
	@Override
	public void register(Account v) throws Exception {//계좌 생성
	dao = new AccountDAOImpl();
	v.setAccNo(MakeAccountNumber.makeAccNum()); //AccountNumber 자동 생성 후
	try{
		dao.insert(v);//v를 AccountDaoImpl에 입력 후 DB에 push.
		System.out.printf("\n계좌번호는 %s 입니다\n",v.getAccNo());
	}catch(Exception e) {
		if(e instanceof SQLRecoverableException){
			throw new Exception("네트워크 에러입니다. IP주소 확인하세요.");
		}
	}
	}

	@Override
	public void remove(String k) throws Exception {//계좌 해지
	dao = new AccountDAOImpl();
	try {
	dao.delete(k);
	}catch(Exception e) {
		if(e instanceof SQLRecoverableException){
			throw new Exception("네트워크 에러입니다. IP주소 확인하세요.");
		}
		throw e;
	}
	}

	@Override
	public void modify(Account v) throws Exception {//계좌 원장 제신고
	dao = new AccountDAOImpl();
	try {
	dao.update(v);
	}catch(Exception e) {
		if(e instanceof SQLRecoverableException){
			throw new Exception("네트워크 에러입니다. IP주소 확인하세요.");
		}
		throw e;
	}
	}

	@Override
	public Account get(String k) throws Exception {//로그인한 고객이 자기가 개설한 계좌를 확인할 수 있음.
		Account account = new Account();
		dao = new AccountDAOImpl();
		try {
		account = dao.select(k);
		}catch(Exception e){
			if(e instanceof SQLRecoverableException){
				throw new Exception("네트워크 에러입니다. IP주소 확인하세요.");
			}
			if(e instanceof SQLException) {
				throw new Exception("계좌번호가 존재하지 않거나 잘못 입력하셨습니다.");
			}
			throw e;
		}
		return account;
	}

	@Override
	public List<Account> get() throws Exception {//원장에 있는 모든 계좌 (은행에 개설된 모든 계좌 불러오기)
		List<Account> list = new ArrayList<>();
		dao = new AccountDAOImpl();
		try {
		list = dao.selectAll();
		}catch(Exception e) {
			throw e;
		}
		return list;
	}

}