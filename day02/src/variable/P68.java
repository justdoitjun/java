package variable;

import java.util.Random;

public class P68 {

	public static void main(String[] args) {
		String s1 = "10";
		int a = 10;
		boolean b1 = true;
		System.out.println(s1 + 10);
		System.out.println(s1 + b1);

		String s3 = "10";
		int s2 = Integer.parseInt(s3);
		System.out.println(s2 + a);

		Random r = new Random();
		int randomNumber = r.nextInt(10);
		System.out.println(randomNumber);
	}

}
