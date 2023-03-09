package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;

public class AccountDAO implements DAO<String, AccountDTO>{
	
	HashMap<String, AccountDTO> db; 
	// db 변수를 필드멤버변수로 선언했으니 생성자만듬
	public AccountDAO() {
		db = new HashMap<>();
	}

	@Override
	public void insert(AccountDTO v) throws Exception {
		if(db.containsKey(v.getAccNo())) {
			throw new Exception("406E001"); // Service - 같은 계좌번호가 있습니다. 에러코드 404-E001
		}
//		else if(db.) {
//			throw new Exception("406E002"); // Service - 계좌번호를 입력하지 않았습니다. 에러코드 E002
//		}
		db.put(v.getAccNo(), v); //Key값은 AccNo로 침.
	}



	@Override
	public void delete(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("406E003");
		}
		db.remove(k);
		
	}

	@Override
	public void update(AccountDTO v) throws Exception {
		db.put(v.getAccNo(), v);
		
	}

	@Override
	public AccountDTO select(String k) throws Exception {
		AccountDTO obj = null;
		if(db.get(k) == null) {
			throw new Exception("404E001");
		}
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<AccountDTO> select() throws Exception {
		List<AccountDTO> arList = new ArrayList<AccountDTO>();
		Collection<AccountDTO> col = db.values();
		for(AccountDTO obj : col) {
			arList.add(obj);
		}
		return arList;
	}

}
