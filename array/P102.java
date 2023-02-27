package array;

import java.util.Arrays;
import java.util.Random;

public class P102 {

	public static void main(String[] args) {

		int []arr = new int[10];
		Random r = new Random();
		
		for(int i = 0; i < arr.length ; i++) {
			arr [i] = r.nextInt(9) + 1 ;
			//참고로 nextInt(x) 안에 있는 x에 99를 넣으면 0~99까지
			// 999를 넣으면 0~999까지
		}
		
		System.out.println(Arrays.toString(arr));
		
//		for(int a:arr) {
//			System.out.printf("%d \t", a);
//		}
		
		//베열의 합과 평균을 구하시오.
		int sum = 0;
		double avr = 0.0;
// (1) conventional way
//		for(int j = 0; j < arr.length ; j++) {
//			sum += arr[j];
//		}
		
// (2) modern way
		for(int a : arr) {
			sum += a;
		}
		avr =  (double) sum / arr.length;
		
		System.out.printf("합 : %d, 평균 : %4.2f \n", sum, avr);
		
		
		
		
	}

}
