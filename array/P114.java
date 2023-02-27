package array;

import java.util.Random;

public class P114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = new int[5][5];
		Random r = new Random();
		
		for (int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(9) +1 ;
			}
		}
		for(int k = 0 ; k < arr.length ; k++) {
			for(int m = 0 ; m < arr[k].length ; m++) {
			System.out.printf("%d\t", arr[k][m]);
			}
			System.out.println("");
		}
		

	}
}
	

