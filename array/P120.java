package array;

public class P120 {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		double avr = 0.0;
		for(int i = 0 ; i < a.length ; i++) {
			sum +=a[i];
		}
		avr = (double) sum / a.length;
		System.out.printf("Sum : %d, Average : %4.2f", sum, avr);
	}

}
