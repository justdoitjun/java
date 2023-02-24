package ifcontrol;


public class P95 {

	public static void main(String[] args) {
		

		double avr = 0.0;
		int count = 0;
		int sum = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum += i;
			count++;

		}
		avr = (sum * 1.0) / count;
		System.out.printf(" 평균은 = %4.2f, 합계는 = %d, 몇 번 더했나요? = %d \n", avr, sum, count-1);
		
		
		double a = 0.0;
		int c = 0;
		int s = 0;
		for (int i = 0; i<= 100 ; i++) {
			if(i%2 != 0) {
				i++;
				continue;
			}
			if(i == 80) {
				break;
			}
			c++;
			s+=c;
			
		}
		System.out.printf(" 평균은 = %4.2f, 합계는 = %d, 몇 번 더했나요? = %d \n", a, s, c);
		
		
		
		
		
		
		double avr2 = 0.0;
		int cnt2 = 0;
		int sum2 = 0;
		int i2 = 1;
		while(i2 <= 100) {
			if(i2%2 == 0) {
				sum2 += i2;	
				cnt2++;
			}
			i2++;
		}
		avr2 = (sum2 * 1.0) / (cnt2-1);
		System.out.printf("2평균은 = %4.2f, 2합계는 = %d, 2몇 번 더했나요? = %d \n",avr2,  sum2, cnt2);		
		
		
	}
}
