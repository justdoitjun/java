package ifcontrol;


public class P94_1 {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		double avr = 0.0;
		for (int i = 0; i <= 100; i += 2) {
			sum += i;
			count = i;

		}
		avr = (sum * 1.0) / count;
		System.out.printf("평균은 = %4.2f, 합계는 = %d", avr, sum);
	}
}
