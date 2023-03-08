package com.kbstar.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO>{
	HashMap<String, UserDTO> db = null;
	//String에는 id값을 넣고, UserDTO값을 value로 넣는데, 이름이나 비밀번호 넣는 구조임. 
	
	public UserDAO() {
		db = new HashMap<>();
	}

	@Override
	public void insert(UserDTO v) throws Exception {
		db.put(v.getId(), v);
	}

	@Override
	public void update(UserDTO v) throws Exception {
		
	}

	@Override
	public void delete(String k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserDTO select(String k) throws Exception {
		UserDTO user = null;
		user = db.get(k);
		return user;
	}

	@Override
	public List<UserDTO> select() throws Exception {
		
		return null;
	}
	

}// end of class
