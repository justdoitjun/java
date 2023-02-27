package array;

import java.util.Arrays;
import java.util.Random;

public class P106 {

	public static void main(String[] args) {

		int[] arr = new int[7];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(99) + 1;
			// 참고로 nextInt(x) 안에 있는 x에 99를 넣으면 0~99까지
			// 999를 넣으면 0~999까지
		}

		int sum = 0;
		double avr = 0.0;
		int cnt = 0;

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 1) {
//				sum += arr[i];
//				cnt++;
//			}
//		}
//		avr = (double) sum / cnt;

		for (int data : arr) {
			if (data % 2 != 0) {
				sum += data;
				cnt++;
			}
		}
		avr = (double) sum / cnt;

		System.out.println(Arrays.toString(arr));
		System.out.printf("합계 : %d, 평균 : %4.2f", sum, avr);

	}

}
