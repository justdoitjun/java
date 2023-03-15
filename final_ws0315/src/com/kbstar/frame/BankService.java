package com.kbstar.frame;

import java.util.List;

import com.kbstar.dto.Cust;

public interface BankService<I, P, K>{
	// K - accountNumber // I - id // P - pwd 
	public Cust login(I i, P p) throws Exception;
	//Cust id Cust pwd가 일치할 경우.
	// 로그인 처리. BankService 사용 권한 부여.
	public void transfer(K k, String receiverAcc , Double amount, String desc) throws Exception;
	//로그인 후, K 계좌번호 입력후 상대방 계좌 입력 적요
	// 이 경우, 상대방 계좌가 DB에 있는지 확인 후,없으면, 에러 메세지 필요
	// 이 경우, 본인 계좌가 DB에 있는지 확인 후, 없으면 에러 메세지 필요.
	public void deposit(K k, double money) throws Exception;
	// 계좌번호 입력 후 현금 입금
	// 계좌번호가 DB에 없다면 에러메세지 필요.
	public void withdraw(K k, double money) throws Exception;
	// 계좌번호 입력 후 현금 출금
	// 계좌번호가 DB에 없다면 에러메세지 필요.
}