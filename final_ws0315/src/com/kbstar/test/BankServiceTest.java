package com.kbstar.test;

import com.kbstar.dto.Account;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Trsc;
import com.kbstar.frame.BankService;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountCRUDServiceImpl;
import com.kbstar.service.BankServiceImpl;
import com.kbstar.service.CustCRUDServiceImple;
import com.kbstar.service.TrscCRUDServiceImpl;

public class BankServiceTest {

	public static void main(String[] args) {
		BankService<String, String, String> bankService = new BankServiceImpl();
		CRUDService<String, Cust> custService = new CustCRUDServiceImple();
		CRUDService<String, Account> accountService = new AccountCRUDServiceImpl();
		CRUDService<String, Trsc> trscService = new TrscCRUDServiceImpl();
		
//		try {
//			Cust cust = bankService.login("id2", "3333");
//			System.out.println(cust);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	
//		try {
//			bankService.deposit("3902100", 11111110);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			bankService.withdraw("3458100", 6333);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			bankService.transfer("3902100", "3458100", 100000.0, "이체");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
