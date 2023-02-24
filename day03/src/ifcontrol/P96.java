package ifcontrol;


public class P96 {

	public static void main(String[] args) {
		int sum3 = 0;
		int cnt3 = 0;
		double  avr3 = 0.0;
		for(int i = 3 ; i<= 100; i+=3) {
			sum3 += i;
			cnt3 ++;
		}
		avr3 = (sum3 * 1.0) / (cnt3*1.0);
		System.out.printf("합계 : %d, 평균 : %4.2.f", sum3, avr3);
		
		
	}
}
