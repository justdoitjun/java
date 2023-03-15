package com.kbstar.dto;

public class Account {
	private String accNo;
	private double balance;
	private String user_name;

	public Account() {
	}

	public Account(String accNo, double balance, String user_name) {
		this.accNo = accNo;
		this.balance = balance;
		this.user_name = user_name;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + ", user_name=" + user_name + "]";
	}

}