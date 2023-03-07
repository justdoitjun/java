package bank;


public class Account {
	private static String accNo; //전화번호
	private static String name; //예금 이름
	private static String accHolder; //예금주
	private static double balance;	//잔액
	
	//Constructor- 음수예외상황
	public Account() {
	}

	public Account(String accNo, String name, String accHolder, double balance) throws WeirdException {
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
	    if (balance < 0) {
	        throw new WeirdException("E003");
	    }
	}// end of constructor - 음수 예외인 경우를 처리해줌.

	//계좌정보 조회	
	public static void searchAccount(){
		System.out.printf("당신의 현재 계좌정보를 출력하겠습니다. \n (1) 계좌번호 : %s \n (2) 예금주 : %s\n", accNo, accHolder);
	}//end of searchAccount method
	
	//잔액 조회
	public static void searchBalance() {
		System.out.printf("잔액정보 : % 4.2f\n", balance);
	}//end of searchBalance method
	
	//입금
	public static void deposit(double k) throws WeirdException {
	    if (k < 0) {
	        throw new WeirdException("E001");
	    }
	    balance += k;
	    System.out.printf("입금되었습니다. 현재잔액은 %4.2f\n", balance);
	}// end of deposit method
	
	//출금
	public static void withdraw(double k) throws WeirdException {
		double tempBalance = 0.0;
		tempBalance -= k;
	    if (tempBalance < 0) {
	        throw new WeirdException("E002");
	    }
	    balance -= k;
	    System.out.printf("출금되었습니다. 현재잔액은 %4.2f\n", balance);
	}// end of withdraw method


}//end of class
