package com.kbstar.service;

import com.kbstar.dao.AccountDAOImpl;
import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dao.TrscDAOImpl;
import com.kbstar.dto.Account;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Trsc;
import com.kbstar.frame.BankService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;

import oracle.net.aso.e;

public class BankServiceImpl implements BankService<String, String, String> {

	DAO<String, String, Cust> custDao;
	DAO<String, String, Account> accountDao;
	DAO<String, String, Trsc> trscDao;

	public BankServiceImpl() {
		custDao = new CustDaoImpl();
		accountDao = new AccountDAOImpl();
		trscDao = new TrscDAOImpl();
	}

	@Override
	public Cust login(String i, String p) throws Exception {
		Cust cust = null;
		try {
			cust = custDao.select(i);
			if (cust != null) {
				if (cust.getPwd().equals(p)) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("비밀번호가 틀립니다.");
					throw new Exception();
				}
			} else {
				System.out.println("아이디가 없습니다.");
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception("로그인 오류입니다.");
		}
		return cust;
	}

	@Override
	public void deposit(String k, double money) throws Exception {
		try {
			Account account = accountDao.select(k);
			double newMoney = account.getBalance() + money;
			account.setBalance(newMoney);
			Trsc trsc = new Trsc(MakeAccountNumber.makeTrNum(), k, "유통입금", money, "I", "입금");
			accountDao.update(account);
			trscDao.insert(trsc);
			System.out.println(trsc);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("입금 오류입니다.");
		}
		
	}

	@Override
	public void withdraw(String k, double money) throws Exception {
		try {
			Account account = accountDao.select(k);
			if (account.getBalance() <= 0 || account.getBalance() - money < 0) {
//				throw new Exception();
				System.out.println("잔액이 부족합니다.");
			}
			account.setBalance(account.getBalance() - money);
			Trsc trsc = new Trsc(MakeAccountNumber.makeTrNum(), k, "유통출금", money, "O", "출금");
			accountDao.update(account);
			trscDao.insert(trsc);
			System.out.println(trsc);
		} catch (Exception e){
			e.printStackTrace();
			throw new Exception("출금 오류입니다.");
		}
	}

	@Override
	public void transfer(String k, String receiverAcc, Double amount, String desc) throws Exception {
		try {
		Account account = accountDao.select(k);
		Account account2 = accountDao.select(receiverAcc);
		if (account.getBalance() <= 0 || account.getBalance() - amount < 0) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		if (account2.getAccNo() != null) {
			account.setBalance(account.getBalance() - amount);
			account2.setBalance(account2.getBalance() + amount);
			Trsc trsc = new Trsc(MakeAccountNumber.makeTrNum(), k, receiverAcc, amount, "O", desc);
			Trsc trsc2 = new Trsc(MakeAccountNumber.makeTrNum(), receiverAcc, k, amount, "I", account.getUser_name());
			trscDao.insert(trsc);
			trscDao.insert(trsc2);
			accountDao.update(account);
			accountDao.update(account2);
			System.out.println(trsc);
			System.out.println(trsc2);
			System.out.println("이체성공");
		} else {
			System.out.println("계좌가 없습니다.");
		}
		} catch(Exception e) {
			e.printStackTrace();
			throw new Exception("이체 오류입니다.");
		}
	}

}
