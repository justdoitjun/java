package com.kbstar.app;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;


import bank.WeirdException;

public class App2 {

	public static void main(String[] args) throws WeirdException {
		ItemDAO tempDAO= new ItemDAO();
		try {
			ItemDTO v = new ItemDTO();
			v.setPrice(-10);
			tempDAO.insert(v);
		}catch(WeirdException e) {
			e.printMessage();
		}
		
		
	}//end of main method;


}
