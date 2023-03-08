package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
	//(1)	//1~10까지의 숫자를 랜덤하게 10개 받으세요.
		Random r = new Random();
		for(int i =0 ; i<10; i++) {
			int num = 0;
			num = r.nextInt(10) + 1;
			a.add(num);
		}//end of for statement.
		
		a.add(0, 100);
//		a.add(10);
//		a.add(20);
//		a.add(30);
		for(int b : a) {
			System.out.println(b);
		}
		
	}

}
