package bank;

import java.util.Scanner;


public class App {

	public static void main(String[] args) throws WeirdException  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bank 계좌개설 터미널입니다. 당신은 4가지 정보를 입력해야합니다. ");
//		System.out.println("첫째, 계좌번호는 고를 수 없습니다. 하지만 앞 5자리는 당신이 선택할 수 있습니다.");
//		String z = sc.next();
//		String a = z + RandomAccountNumber.make();
//		강사님이 한 번 해보라고 하셔서 해보다가 에러가 나서 퇴근할 시간이라 여기까지만 함. 껄껄.
		String a = sc.next();
		System.out.println(a);
		System.out.println("둘째, 계좌이름을 입력하세요.");
		String b = sc.next();
		System.out.println("셋째, 당신의 이름을 입력하세요.");
		String c = sc.next();
		System.out.println("마지막으로, 지금 당신의 잔액을 입력하세요. 잔액이 없다면 입금할 금액을 입력하세요.");
		Double d = Double.parseDouble(sc.next());


		try {
			new Account(a, b, c, d);
		} catch (WeirdException e) {
		    e.printMessage();
		    sc.close();
		    System.out.println("잘못된 값을 넣으셨습니다. 시스템을 종료합니다.");
		    return;
		}

		Account.searchAccount();
		System.out.println("=============================================");
		Account.searchBalance();
		System.out.println("=============================================");
		Loop1 : while(true) {
			System.out.println("추가로 입금하시겠습니까. 입급하고 싶다면, d를 누르고, 출금하고 싶다면, w를 입력하세요. \n 끝내고 싶다면 아무거나 누르세요.");
			String doIt = sc.next();
			if(doIt.equals("d")) {
				System.out.println("당신은 입금을 선택하셨습니다. 입금할 금액을 입력하세요.");
				double k = Double.parseDouble(sc.next());
				try {
				    Account.deposit(k);
				} catch (WeirdException e) {
				    e.printMessage();
				}
			}// end of if
			else if(doIt.equals("w")) {
				System.out.println("혹시 출금하시겠습니까. 금액을 넣어주세요.");
				double g = Double.parseDouble(sc.next());
				try {
				    Account.withdraw(g);
				} catch (WeirdException e) {
				    e.printMessage();
				}
			}// end of else if
			else {
				System.out.println("아무거나 입력하셨습니다. 시스템을 종료합니다.");
				break Loop1;
			}
			
		}//end of while
		sc.close();
	}//end of main

}//end of class
