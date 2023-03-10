package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.DAO;

public class TransactionDAO implements DAO<String, TransactionDTO>{

	HashMap<String, TransactionDTO> db;
	
	public TransactionDAO() {
		
		db = new HashMap<String, TransactionDTO>();
	}
	
	@Override
	public void insert(TransactionDTO v) throws Exception {
		if(db.containsKey(v.getDate())) {
			throw new Exception("DB Error");
		}
		db.put(v.getDate(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		
	}

	@Override
	public void update(TransactionDTO v) throws Exception {
			
	}

	@Override
	public TransactionDTO select(String k) throws Exception {
		TransactionDTO obj = null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<TransactionDTO> select() throws Exception {
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		Collection<TransactionDTO> col =  db.values();
		for(TransactionDTO obj: col) {
			list.add(obj);
		}
		return list;
	}
	// 고객이 보유 하고 있는 계좌번호를 입력 하면
	// 해당 계좌의 거래 내역을 조회 한다.
	@Override
	public List<TransactionDTO> search(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
