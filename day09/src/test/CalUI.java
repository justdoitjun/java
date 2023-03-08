package test;

import java.util.Scanner;

public class CalUI {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 numbers");
		Double a = Double.parseDouble(sc.next());
		Double b = Double.parseDouble(sc.next());
		double result = 0.0;
		try {
			result = Cal.div(a, b);
			System.out.println(result);
		} catch(InfinityException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}//end of main

}// end of class
