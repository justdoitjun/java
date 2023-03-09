package com.kbstar.dto;

public class TransactionDTO {
	private String date; // 일시 언제 보냈는지...Key값이 된다. 계좌번호일 거 같지만, 고유한 값. 
	private String accNo; // 어떤 계좌의 거래내역이냐. 
	private double balance; //어떤 계좌의 잔액.
	private String type; // In(입금) Out(출금)
	private String desc; // 적요
	
	public TransactionDTO() {
	}

	public TransactionDTO(String date, String accNo, double balance, String type, String desc) {
		this.date = date;
		this.accNo = accNo;
		this.balance = balance;
		this.type = type;
		this.desc = desc;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "TransactionDTO [date=" + date + ", accNo=" + accNo + ", balance=" + balance + ", type=" + type
				+ ", desc=" + desc + "]";
	}
	

}
