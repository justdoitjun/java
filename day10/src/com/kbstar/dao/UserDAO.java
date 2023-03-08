package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

import bank.WeirdException;

public class UserDAO implements DAO<String, UserDTO>{

	@Override
	public void insert(UserDTO v)  throws WeirdException{
		if(v.getId().equals("id01")) {
			throw new WeirdException("E001");
		}//end of if statement
		System.out.println(v.getId()+ "님이 저장되었습니다.");
		
	}

	@Override
	public void modify(UserDTO v) throws WeirdException{
		if(v.getId().equals("id01")) {
			throw new WeirdException("E001");
		}//end of if statement
		System.out.println(v.getId()+ "님이 수정되었습니다.");
		
	}

	@Override
	public void remove(String k) throws WeirdException{
		if(k.equals("id01")) {
			throw new WeirdException("E001");
		}//end of if statement
		System.out.println(k+ "님이 삭제되었습니다.");
		
	}



}
