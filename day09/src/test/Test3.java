package test;

import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args) {
		double a = 0;
		double result = 10 / a;
		System.out.println(result);
		try {
		Thread.sleep(3000);
		}catch(InterruptedException e) {
			System.out.print("false");
		}
		InputStreamReader ir = new InputStreamReader(System.in);
		System.out.println("Input?");
		int b = 0;
		try {
			b = ir.read();
			System.out.println(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println("End");

	}

}
