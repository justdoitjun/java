package bank;

public class Atm {

	public static void main(String[] args) throws WeirdException {
		Account acc1 = null;
		try {
		acc1 = new Account(-10);
//		System.out.println(acc1);
		acc1.withdrawgangsa(-10);
		}catch(WeirdException e){
//		e.printMessage();
//		e.printStackTrace();
		System.out.println(MakeMessage.makeMessage(e.getMessage()));
		System.out.println(e.getMessage());
		}
	}//end of main

}
