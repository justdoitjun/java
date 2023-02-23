package variable;

public class P69 {

	public static void main(String[] args) {
		String str = "abcdef";
		str = str.toUpperCase();
		System.out.println(str);
		
		String str2 = str.replace('A', 'U');
		System.out.println(str2);
		System.out.println(str);
		
		int lng = str.length();
		System.out.println(lng); //6개 있구나
		
		int idx = str.indexOf("B");
		System.out.println(idx); //위치값
		
		char str3 = str.charAt(0);
		System.out.println(str3);

		String str4 = str.substring(1, 3);
		System.out.println(str4);
		
//		String email = "imlee@tonesol.com";
//		
//		String id = "";
		
//		System.out.printf("%s , %s", id, domain)
	}

}
