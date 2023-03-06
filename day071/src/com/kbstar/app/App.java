package com.kbstar.app;

import com.kbstar.dao.AccountMariaDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;

public class App {

	public static void main(String[] args) {
		DAO mariaDao = new AccountMariaDAO();
		AccountDTO account = new AccountDTO("100", "maria", 1700);
		mariaDao.insert(account);
		
//		DAO oracleDao = new AccountOracleDAO();
//		AccountDTO account = new AccountDTO("100", "savings", 1000);
//		oracleDao.insert(account);
		
		
//		DAO oracleDao = new UserOracleDAO();
//		UserDTO user = new UserDTO("id01", "pw01", "james");
//		oracleDao.insert(user);

	}
}
