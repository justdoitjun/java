package variable;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		double d = 10.2345555;
		String str1 = "abc";
		String str2 = "abc";
		System.out.printf("%d %4.2f %s", a, d, str1);
		System.out.printf("%d\t%10.2f\t%s\n", a, d, str1);
		
		if(str1 == str2) {
			System.out.println("TRUE");
		}
		
		if(str1.equals(str2)) {
			System.out.println("TRUE");
		}
		
		
		// 매우 중요함....!!!!!!!!! 주소값이 다르기 때문에 false가 나오는 것임. 
		
		String str3 = new String("abc");
		
		if(str1 == str3) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}

	}

}
