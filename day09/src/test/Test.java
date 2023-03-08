package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Input");
			num = Integer.parseInt(sc.next());
			int result = 10 / num;
			System.out.println(result);
		}catch(Exception e1) {
			System.out.println("Wrong Input");
		}finally {
			sc.close();
		}
	}

}
