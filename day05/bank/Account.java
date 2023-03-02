package bank;

public class Account {
	private String accNum;
	private String accName;
	private double balance;
	
	public Account() {
		MakeAccountNumber makeNum = new MakeAccountNumber();
		this.accNum = makeNum.makeAccNum();
	}
	public Account(String accName, double balance) {
		this();	
		this.accName = accName;
		this.balance = balance;
	}
	public Account(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	
	
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + "]";
	}
	//getter - setter
	public double getBalance() {
		return balance;
	} // 잔액 조회
	
	//method
	public void withdraw(double money) {
		if(money > this.balance) {
			System.out.println("You can not withdraw your bucks over than your deposits.");
			return;
		}
		if(money <= 0) {
			System.out.println("You can not withdraw zero amount of dollars.");
			return;
		}
		this.balance -= money;
	}// end of withdrawal
	public void deposit(double money) {
		if(money <= 0) {
			System.out.println("wrong deposit");
			return;
		}
		this.balance += money;
		
		
		
		
		
	}// end of deposits

	
	
	

}
