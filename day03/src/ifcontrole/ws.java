package ifcontrole;

public class ws {
	//3의 배수의 합,평균
	//4의 배수의 합,평균
	//7의 배수의 합,평균

	public static void main(String[] args) {
		//3의 배수의 합,평균
		int sum3 = 0;
		int cnt3 = 0;
		double  avr3 = 0.0;
		for(int i = 3 ; i<= 100; i+=3) {
			sum3 += i;
			cnt3 ++;
		}
		avr3 = (sum3 * 1.0) / (cnt3*1.0);
		System.out.printf("합계 : %d, 평균 : %4.2f\n", sum3, avr3);
		
		//4의 배수의 합,평균
		int sum4 = 0;
		int cnt4 = 0;
		double  avr4 = 0.0;
		for(int i = 4 ; i<= 100; i+=4) {
			sum4 += i;
			cnt4 ++;
		}
		avr4 = (sum4 * 1.0) / (cnt4*1.0);
		System.out.printf("합계 : %d, 평균 : %4.2f\n", sum4, avr4);
		
		//7의 배수의 합,평균
		int sum7 = 0;
		int cnt7 = 0;
		double  avr7 = 0.0;
		for(int i = 7 ; i<= 100; i+=7) {
			sum7 += i;
			cnt7 ++;
		}
		avr7 = (sum7 * 1.0) / (cnt7*1.0);
		System.out.printf("합계 : %d, 평균 : %4.2f\n", sum7, avr7);

	}
	

}
