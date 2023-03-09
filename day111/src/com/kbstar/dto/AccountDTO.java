package com.kbstar.dto;

public class AccountDTO {
	private String accNo;
	private double balance;
	private String accHolder;
	public AccountDTO() {
	}
	public AccountDTO(String accNo, double balance, String accHolder) {
		this.accNo = accNo;
		this.balance = balance;
		this.accHolder = accHolder;
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
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	@Override
	public String toString() {
		return "AccountDTO accNo=" + accNo + ", balance=" + balance + ", accHolder=" + accHolder + "\n"; 
	}
	

}
