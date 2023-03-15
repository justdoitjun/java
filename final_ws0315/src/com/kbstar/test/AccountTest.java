package com.kbstar.test;

import com.kbstar.dto.Account;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountCRUDServiceImpl;

public class AccountTest {


	public static void main(String[] args) {
		
		
//		//주요 TEST 사항(1) 네트워크 오류인 경우
//		//주요 TEST 사항(2) 계좌번호가 존재 하지 않는 경우.
//		CRUDService<String, Account> crudService = new AccountCRUDServiceImpl();
//		try {
//			crudService.remove("387810");
//			System.out.println("Success!");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		//TEST 대상 (1) 잔액이 음수가 되면 에러메세지를 토해내는가?
//		//TEST 대상 (2) 네트워크가 빠지면, 에러메세지를 정상적으로 내보내는가?
//		CRUDService<String, Account> crudService =
//				new AccountCRUDServiceImpl();
//		Account account = new Account(null, 50,"JunTestPositive");
//		try {
//			crudService.register(account);
//			System.out.println("Success");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

//		//Test대상 (1) 네트워크 오류
//		//Test대상 (2) 존재하지 않는 계좌번호를 선택 한 경우 에러처리
//		CRUDService<String, Account> service =
//				new AccountCRUDServiceImpl();
//		List<Account> list = new ArrayList<>();
//		try {
//			list = service.get();
//			if(list.size() == 0) {
//				System.out.println("불러올 내용이 없습니다.");
//				return;
//			}
//			int cnt = 0;
//			for (Account el : list) {
//				cnt++;
//				System.out.printf("%d번째 ",cnt);
//				System.out.println(el);
//			}
//				System.out.println("Success");
//				System.out.println("모든 정보를 호출하셨습니다.");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		//Test대상 (1) 네트워크 오류
//		//Test대상 (2) 존재하지 않는 계좌번호를 선택 한 경우 에러처리
//		CRUDService<String, Account> crudService = new AccountCRUDServiceImpl();
//
//		Account account = null;
//		String searchFor = "JunTestPositive";
//		try {
//			account = crudService.get(searchFor);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			return;
//		}
//		System.out.printf("선택하신 계좌번호 %s에 대한 결과를 불러오겠습니다.\n",searchFor);
//		System.out.println(account);

//		//개명처리 (제신고)테스트
//		//Test대상 (1) 네트워크 오류
//		
//		CRUDService<String, Account> crudService = new AccountCRUDServiceImpl();
//
//		Account account = null;
//		try {
//			account = new Account("3691100",0, "홍길동새이름");
//			crudService.modify(account);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			return;
//		}
//		System.out.println("제신고 거래(개명처리)가 정상적으로 완료되었습니다.");

		
		
		
		
	}
	

}