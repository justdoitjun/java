package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>();
		
		System.out.println("Start of Set");
		Random r = new Random();
		for(int i = 0; i <10; i++) {
			int num = r.nextInt(10) + 1;
			a.add(num);
		}//end of for statement
		System.out.println(a.size());
		System.out.println("========");
		for(int b : a) {
			System.out.println(b);
		}//end of for statement
		System.out.println("End of Set");
		
	}//end of main

}//end of class
