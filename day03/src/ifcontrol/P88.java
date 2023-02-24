package ifcontrol;

public class P88 {

	public static void main(String[] args) {
	
		String grade = "";
		Double score = 99.33;
		
		if((score<= 100 && score>= 95) || (score <=90 && score >= 85)) {
			grade = "VIP";
		}else if((score<= 80 && score>= 75 )|| (score <= 65 && score >= 60)) {
			grade = "GOLD";
		}else {
			grade = "NORMAL";
		}
		
		System.out.printf("%s, %4.2f\n", grade, score);
	}

}
