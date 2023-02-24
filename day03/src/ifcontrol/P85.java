package ifcontrol;

public class P85 {

	public static void main(String[] args) {
		String grade = "VIP";
		System.out.println("Start...");
//      자주 실수하는 부분
//		if(grade == "VIP") {
//			이렇게 쓰면 안된다. 참조변수 기억나지?
//		}
		
		//(1) 일반적인 If 아래는 올바르게 쓴 부분
		if(grade.equals("VIP")) {
			System.out.println("실행...");
			//return;
		}
		
		
		
		//(2) If-Else 
		String gender = "M";
		if(gender.equals("M")) {
			System.out.println("Male...");
		}else {
			System.out.println("Female...");
		}
		
		
		//(3) Various IFs.
		Double scores = 99.8;
		if(scores >= 90) {
			System.out.println("Credit : A...");
		}else if(scores >= 80) {
			System.out.println("Credit : B...");
		}else if(scores >= 70) {
			System.out.println("Credit : C...");
		}else {
			System.out.println("Credit : NULL");
		}
		
		
		
		
		System.out.println("End...");

	}

}
