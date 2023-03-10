package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO>{

	HashMap<String, UserDTO> db;
	
	public UserDAO() {
		db = new HashMap<>();
	}
	
	@Override
	public void insert(UserDTO v) throws Exception {
		if(db.containsKey(v.getId())) {
			throw new Exception("DB Error");
		}
		db.put(v.getId(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("");
		}
		db.remove(k);
	}

	@Override
	public void update(UserDTO v) throws Exception {
		if(!db.containsKey(v.getId())) {
			throw new Exception("");
		}
		db.put(v.getId(), v);
	}

	@Override
	public UserDTO select(String k) throws Exception {
		UserDTO obj = null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<UserDTO> select() throws Exception {
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		Collection<UserDTO> col =  db.values();
		
		for(UserDTO obj:col) {
			list.add(obj);
		}
		
		return list;
	}

	@Override
	public List<UserDTO> search(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}



