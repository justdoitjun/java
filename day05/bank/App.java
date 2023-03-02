package bank;

public class App {

	public static void main(String[] args) {
		Account acc = new Account( "Jane", 100_000.00);
		System.out.println(acc);
		
		acc.deposit(3000);
		acc.withdraw(1000000);
		System.out.println(acc);

	}

}
