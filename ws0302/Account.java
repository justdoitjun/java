package ws0302;


public class Account {
	//Field
	private String accNum;
	private String accName;
	private double balance;
	private double rate;
	private String grade;
	//End of field
	
	//Constructor
	public Account() {
		this.accNum = null;
		this.accNum = MakeAccountNumber.makeAccNum();
	}
	public Account(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	public Account( String accName, double balance, double rate, String grade) {
		this();
		this.accName = accName;
		this.rate = rate;
		this.balance = balance;
		this.grade = grade;
	}
	
	//End of constructor
	
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + ", rate=" + rate
				+ ", grade=" + grade + "]";
	}

	
	//getter - setter
	public double getBalance() {
		return balance;
	} // 잔액 조회
	public String getGrade() {
		return grade;
	}//고객 등급 조회
	
	
	
	
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
	public double getInterest() {
		return balance * rate;
	}//end of interests   

	//End of methods
	
	

}
