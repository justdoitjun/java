package test;

import java.util.Random;

public class Test4 {

	public static void main(String[] args) {
		int ar [] = new int[10];
		Random r = new Random();
	try {
			for(int i = 0; i < ar.length ; i++) {
				ar[i] = r.nextInt(10) +1;
			}
			for (int data : ar) {
				System.out.println(data);
				Thread.sleep(1000);
			}
			System.out.println("complete");
	} catch(Exception e) {
		System.out.println("You put wrong number in your code, idiot!");
	}
			
			
			
	}// end of main

}
