package com.kbstar.test;

import com.kbstar.dto.AccountDTO;
import com.kbstar.service.AccountService;

public class AccountDeleteTest {

	public static void main(String[] args) throws Exception {
		AccountService acs = new AccountService();
		AccountDTO test1 = new AccountDTO("test", 10.0, "test1");
		
		acs.register(test1);
		
		System.out.println(acs.get(test1.getAccNo()));;

	}

}
