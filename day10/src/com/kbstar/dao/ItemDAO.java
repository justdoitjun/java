package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;

import com.kbstar.frame.DAO;

import bank.WeirdException;

public class ItemDAO implements DAO<String, ItemDTO >{

	@Override
	public void insert(ItemDTO v) throws WeirdException {
		if(v.setPrice(v.price)<0) {
			throw new WeirdException("E001");
		}
	}

	@Override
	public void modify(ItemDTO v) throws WeirdException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String k) throws WeirdException {
		// TODO Auto-generated method stub
		
	}


	


}//end of class
