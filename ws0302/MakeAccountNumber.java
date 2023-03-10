package ws0302;

import java.util.Calendar;
import java.util.Random;

public class MakeAccountNumber {
	public static String makeAccNum() {
		String accNum = ""; 
		Random random = new Random();// consoler가 millisecond보다 빨라서 random값 임의입력
		int randomNumber = random.nextInt(100);

		Calendar cal = Calendar.getInstance();
		accNum = "" + cal.get(Calendar.YEAR)
					+ (cal.get(Calendar.MONTH)+1)
					+ cal.get(Calendar.DAY_OF_MONTH)
					+cal.get(Calendar.MILLISECOND)
					+ String.valueOf(randomNumber);

		return accNum;
	} // static 을 붙이면, 
		



}// End of Class
