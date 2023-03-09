package com.kbstar.test;

import com.kbstar.dto.AccountDTO;
import com.kbstar.service.AccountService;

public class AccountRegisterTest {

	public static void main(String[] args) throws Exception {
		AccountDTO test1 = new AccountDTO("acctest1", 10.0, "test1");
		AccountDTO test2 = new AccountDTO("acctest2", 20.0, "test2");
		AccountDTO intentionalerror1 = new AccountDTO("acctest1", 30.0, "test3");
		//AccountDTO intentionalerror2 = new AccountDTO("", 40.0, "test4");
		AccountService acs = new AccountService();

		//register test
		System.out.println("=====(1)====");
		acs.register(test1);
		acs.register(test2);
		acs.register(intentionalerror1);
		//acs.register(intentionalerror2);
		
		System.out.println("=====(2)====");
		System.out.println(acs.get(test1.getAccNo()));;
		System.out.println("test1 개별 register확인완료");
		System.out.println("=====(3)====");

		//registered tests checked.
		System.out.println(acs.get());
		System.out.println("지금까지 입력된 모든 자료를 출력");
		System.out.println("=====(4)====");
		acs.delete("test4");
		acs.delete(test1.getAccNo());
		System.out.println(acs.get());
		acs.delete(test2.getAccNo());
		System.out.println(acs.get());
		
		System.out.println("삭제된 데이터를 일부러 에러 내보고, test1과 test2를 순차적으로 삭제해봄. ");
		System.out.println("=====(5)====");
		
		
		
		//acs.delete(test2.getAccHolder()); 
		//accHolder는 똑같은 String이어도 절대 지워지지 않는다. 
		//그 이유는 HashMap의 키값은 맨 앞의 것을 가져오기 때문임.
		//acs.delete(test2.getAccNo()); // 이 코드에서 test2가 지워지는 거임. 
	}

}
