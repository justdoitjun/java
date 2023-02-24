package ifcontrol;

public class P84 {

	public static void main(String[] args) {
		
	//(1) 
	String gender = "F";
	Double score = 85.4;
	String grade = "";
	
		if(score >= 90) {
			if(gender.equals("M") ) {
				grade = "MVIP";
			}else {
				grade = "FVIP";
			}
		}else if(score >= 80 && score < 90) {
			if(gender.equals("M")) {
				grade = "MGOLD";
			}else {
				grade = "FGOLD";
			}
		}else if(score >= 70 && score < 80) {
			if(gender.equals("M")) {
				grade = "MNORMAL";
			}else {
				grade = "FNORMAL";
			}
		}
	System.out.printf("%s, %4.2f\n", grade, score);
	
	//(2) Switch문 자주 쓰이진 않음.
	
//	switch(grade) {
//	case "FVIP" : 
//		score += 100;
//		break;
//	case "FGOLD" :
//		score += 90;
//		break;
//	case "MVIP" :
//		score += 100;
//		break;
//	case "MGOLD" : 
//		score += 90;
//		break;
//	default :
//		score += 10;
//	}
	
	
	switch(grade) {
	case "MVIP" :
	case "FVIP" : 
		score += 100;

	case "MGOLD" : 
	case "FGOLD" :
		score += 90;
		
	default :
		score += 10;
	}
	
	
	
	System.out.printf("%s, %s, %4.2f\n", grade, gender, score);
	

	}

}
