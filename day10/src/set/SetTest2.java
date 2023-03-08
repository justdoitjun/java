package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest2 {

	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>();
		
		System.out.println("Start of Set");
		Random r = new Random();
		while(a.size()<10) {
			a.add(r.nextInt(100)+1);
		}//end of while statement
		System.out.println(a.size()); // 개수 확인
		System.out.println("========");
		for(int b : a) {
			System.out.println(b);
		}//end of for statement
		System.out.println("End of Set");
		
	}//end of main

}//end of class
