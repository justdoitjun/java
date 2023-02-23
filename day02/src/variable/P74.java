package variable;

import java.util.Random;
import java.util.Scanner;

public class P74 {

	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("숫자를 입력하십시오(10~100)");
		String cmd = sc2.next();
		//10에서 100 사이의 숫자를 입력 받는다. 
		//1부터 입력 받은 숫자까지의 범위에서 랜덤한 숫자를 발생시키시오.
		Random r = new Random();
		int cmd2 = Integer.valueOf(cmd);
		int cmd3 = Integer.parseInt(cmd);
		int randomNumber = r.nextInt(cmd2);
		int rndNumber = r.nextInt(cmd3);
		System.out.printf("%s를 입력했습니다. \n%s도 입력되었습니다.", randomNumber, rndNumber);
		sc2.close();
	}

}
