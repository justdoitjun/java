package bank;

import java.util.Random;

public class RandomAccountNumber {

	public RandomAccountNumber() {
	} 
	
	public static String make() {
		String accPiece = "";
		Random r = new Random(10);
		accPiece = r + "";
//		accPiece = r.toString();
		return accPiece;
	}
	
}
