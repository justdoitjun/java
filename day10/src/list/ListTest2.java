package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		
		//1~10까지의 숫자를 20개 입력.
		//단, while문 이용
		//List 정보 출력
		
		System.out.println("Start of Array");
		
		Random r = new Random();
		int cnt =0;
		while(a.size()<20){
			double el;
			el = r.nextDouble()*10.0;
			a.add((int) el);
			cnt++;
//			System.out.printf("%d 번째 랜덤 숫자는 %4.2f입니다.\n",cnt, el);
		}//end of while statement.
		
		
		System.out.println(a);
		
		System.out.println("End of Array");
		
	}//end of main

}//end of class
