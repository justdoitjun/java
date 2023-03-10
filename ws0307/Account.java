package ws0307;

// 공부할 때 찾아봐야할 것. 왜 public void 를 쓰면, static을 메소드랑 필드값에 넣으라고 하지? static이 뭔 의미일까. 
// 공부하다가 알게 된 거임. 공부는 한줄로 간단하게 딱 한마디로 직관적으로 막말로 요약을 해야 기억에 남으니깐...막말로 정리하자면
// 다른 클래스 가서 이 클래스 변수나 메소드 부르고 싶을 때 static 쓰면, 그냥 어디서든 Account.변수   Account.메소드로  겁나 편하게 부를 수 있음.
// 그냥 그래서 static 쓰는 거였음. 


public class Account {
	private static String accNo; // 전화번호
	private static String name; // 예금 이름
	private static String accHolder; // 예금주
	private static double balance; // 잔액

	// Constructor- 음수예외상황
	// 기본 생성자를 사용하지 않아서 삭제.
	public Account(String accNo, String name, String accHolder, double balance) throws WeirdException {
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
		if (balance < 0) {
			throw new WeirdException("E003");
		}
	}

	// 계좌정보 조회
	public static void searchAccount() {
		System.out.printf("당신의 현재 계좌정보를 출력하겠습니다. \n (1) 계좌번호 : %s \n (2) 예금주 : %s\n", accNo, accHolder);
	

	// 잔액 조회
	public static void searchBalance() {
		System.out.printf("잔액정보 : % 4.2f\n", balance);
	}

	// 입금
	public static void deposit(double money) throws WeirdException {
		if (money < 0) {
			throw new WeirdException("E001");
		}
		balance += money;
		System.out.printf("입금되었습니다. 현재잔액은 %4.2f\n", balance);
	}

	// 출금
	public static void withdraw(double money) throws WeirdException {
		double tempBalance = 0.0;
		tempBalance -= money;
		
		if (tempBalance < 0) {
			throw new WeirdException("E002");
		}
		balance -= money;
		System.out.printf("출금되었습니다. 현재잔액은 %4.2f\n", balance);
	}

}
