package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input");
		try {
		int num = Integer.parseInt(sc.next());
		int result = 10 / num;
		System.out.println(result);
		}catch(ArithmeticException e1) {
			System.out.println("You can't put zero");
			e1.printStackTrace();
		}catch(Exception e2) {
			System.out.println("You can't put character");
		}finally {
			sc.close();
		}

	}

}
