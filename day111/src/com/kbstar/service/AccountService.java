package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.notif.NotificationImpl;

public class AccountService implements CRUDService<String, AccountDTO> {
	DAO<String, AccountDTO> acc;
	Notification notif;

	// 멤버 변수를 선언함. 선언했으니, 기본 생성자를 먼저 만들어야함.
	public AccountService() {
		acc = new AccountDAO();
		notif = new NotificationImpl();
	}
	// 메소드 시작한다.

	@Override
	public void register(AccountDTO v) throws Exception {
		try {
		acc.insert(v);
		} catch(Exception e) {
			if(e.getMessage() == "406E001") {
				System.out.println("지금의 에러는 앞서 넣은 계좌번호와 중복되었기 때문입니다.");
			}
			else if(e.getMessage()== "406E002") {
				System.out.println("지금의 에러는 당신이 아무 값도 넣지 않았기 때문에 생긴 오류입니다. ");
			}
		}
	}

	@Override
	public void delete(String k) throws Exception {
		try {
		acc.delete(k);
		} catch(Exception e){
			if(e.getMessage() == "406E003") {
				System.out.println("삭제를 원하시는 해당 계좌번호는 존재하지 않습니다. ");
			}
		}
	}

	@Override
	public void modify(AccountDTO v) throws Exception {
		acc.update(v);
	}

	@Override
	public AccountDTO get(String k) throws Exception {
		AccountDTO obj = null;
		obj = acc.select(k);
		return obj;
	}

	@Override
	public List<AccountDTO> get() throws Exception {
		List<AccountDTO> list = null;
		list = acc.select();
		return list;
	}

}
