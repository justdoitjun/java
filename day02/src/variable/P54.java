package variable;

public class P54 {

	public static void main(String[] args) {
		//boolean
		boolean b1 = true;
		boolean b2 = 10 < 5;
		System.out.println(b2);
		
		
		//정수
		int b3 = 10;
		//long n2 = 200000000000000000; //오류 정수의 기본은 int
		long b4 = 200000000000000000L; 
		
		
		//실수
		double b5 = 1.0;   //기본형
		//float f1 = 1.0;   //오류 실수의 기본은 double
		float b6 = 1.0f;
		double b7 = 1/2;
		System.out.println(b7);  //오른쪽에서 정수와 정수가 연산되면 int값으로 저장이 된다. 
		double b8 = (double) 1 / (double) 2;
		System.out.println(b8);
		//		float b9 = 10.0/3.0;
		//		System.out.println(b9);   --> 에러가 남.
		float b10 = 10.0F/3.0F;
		System.out.println(b10);
		
		
		//문자
		char c1 = 'C';
		System.out.println(c1);
		char c2 = 65;
		System.out.println(c2);
		
		
		//타입간 사칙연산
		int d1 = 10;
		double d2 = 15.0;
	   //int d3 = d1 + d2;   오류가 남. 왜? double값이 들어오니깐. 너무 크잖아
		double d4 = d1 + d2;
	}

}
