package ifcontrol;

public class P90 {

	public static void main(String[] args) {
		
//		int a = 3;
//		int b = 2;
//		int c = 1;
		
//		int max = 0;
//		int min = 0;
//		// 두가지 수의 최대값과 최소값을 구하시오.
//		if( a >= b) {
//			max = a;
//			min = b;
//		}else {
//			max = b;
//			min = a;
//		}
//		System.out.printf("MAX : %d, MIN: %d\n", max, min);
//		
//		//  세가지 수의 최대값과 최소값을 구하시오.
//		if(a >= b){ // a가 b보다 큰 경우라고 우선 가정. (1)
//				if(b>=c) { // b가 c보다 큰 경우 (a>b>c)
//					min = c; 
//					max = a;
//				}
//				
//				else if (c > b){ //c가 b보다 큰 경우
//					if(c > a) { // (c>a>b)
//						max = c;
//						min = b;
//					}else if(c < a) { //c가 b보다 작은 경우. (a>c>b)
//						max = a;
//						min = b;
//				}
//			}
//		}	
//		if(a < b){ // a가 b보다 작은 경우라고 가정. (2) (b>a)
//			if(c >= b) { // c가 b보다 큰 경우 (c>b>a)
//				min = a;
//				max = c;
//			}
//			
//			else if (b > c){ //c가 b보다 작은 경우(b>c)
//				if(c >= a) {//c가 a보다 큰 경우엔  (b>c>a)
//					max = b;
//					min = a;
//				}else if(c < a) { //c가 a보다 작은 경우엔 (b>a>c)
//					max = b;
//					min = c;
//			}
//		}
//	}
//		
//		System.out.printf("MAX : %d, MIN: %d\n", max, min);
	
		
	//4개 이상인 경우.
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		int d = 4;
//	
//		
//		int max = a;
//		if (b > max) {
//			max = b;
//		}if (c > max) {
//			max = c;
//		}if (d > max) {
//			max = d;
//		}
//		
//		int min = a;
//		if (b < min) {
//			min = b;
//		}if (c < min) {
//			min = c;
//		}if (d < min) {
//			min = d;
//		}
//		System.out.printf("MAX : %d, MIN: %d", max, min);
	
		int a = 1;
		int b = 2;
		int c = 3;
		int max = 0;
		int min = 0;
		
		if(a>b) {
			max = Math.max(a, c);
			min = Math.min(b, c);
		}else {
			max = Math.max(b, c);
			min = Math.min(a, c);
		}
		
		System.out.printf("%d, %d",max, min);
		
		
		
	}

}
