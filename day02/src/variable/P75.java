package variable;

public class P75 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = a++;
		int d = ++b;
		System.out.printf("%d, %d\n",c,d);
		// 10, 11
		System.out.printf("%d, %d\n",a,b);
		// 11, 11
		int result = a++ + ++b;
		System.out.printf("%d, %d\n",a,b);
		// 12, 12
		System.out.println(result);
		//23 = (12 + 11)
		
		int aa = 10;
		int bb = 10;
		System.out.println((aa++ >= 0) | (bb++ <= 0));
		System.out.printf("%d, %d\n",aa,bb);
		
		int cc = 10;
		int dd = 10;
		System.out.println((cc++ >= 0) || (dd++ <= 0));
		System.out.printf("%d, %d\n",cc,dd);
		
	}

}
