package ifcontrol;

public class P86 {

	public static void main(String[] args) {
		String grade = "";
		Double score = 98.69999;
		
		if(score >= 90) {
			grade = "VIP";
		}else if(score >= 80) {
			grade = "GOLD";
		}else if(score >= 70) {
			grade = "SILVER";
		}else if(score >= 60) {
			grade = "BRONZE";
		}else {
			grade = "NORMAL";
		}
		
		System.out.printf("%s, %4.2f \n", grade, score);

		//삼항연산자 연습
		String grade2 = "";
		Double score2 = 99.3955;
		grade2 = (score >= 90) ? "VIP" :(score >= 80) ? "GOLD" :(score >= 70) ? "SILVER" :(score >= 60) ? "BRONZE" : "NORMAL";
		
		System.out.printf("%s, %4.2f \n",  grade2, score2);
	}
}
