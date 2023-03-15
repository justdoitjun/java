package com.kbstar.dto;

public class Trsc {
	private String tracNo;
	private String accNo;
	private String receiverAcc;
	private double amount;
	private String type;
	private String trscDesc;
	
	public Trsc() {
	}

	public Trsc(String tracNo, String accNo, String receiverAcc, double amount, String type, String trscDesc) {
		this.tracNo = tracNo;
		this.accNo = accNo;
		this.receiverAcc = receiverAcc;
		this.amount = amount;
		this.type = type;
		this.trscDesc = trscDesc;
	}

	public String getTracNo() {
		return tracNo;
	}

	public void setTracNo(String tracNo) {
		this.tracNo = tracNo;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getReceiverAcc() {
		return receiverAcc;
	}

	public void setReceiverAcc(String receiverAcc) {
		this.receiverAcc = receiverAcc;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTrscDesc() {
		return trscDesc;
	}

	public void setTrscDesc(String trscDesc) {
		this.trscDesc = trscDesc;
	}

	@Override
	public String toString() {
		return "Trsc [tracNo=" + tracNo + ", accNo=" + accNo + ", receiverAcc=" + receiverAcc + ", amount=" + amount
				+ ", type=" + type + ", trscDesc=" + trscDesc + "]";
	}
	
	
	
	
}