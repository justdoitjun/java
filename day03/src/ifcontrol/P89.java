package ifcontrol;

public class P89 {

	public static void main(String[] args) {
		
	//(1) 조건 요소가 2개라면?
	String gender = "M";
	Double score = 99.4;
	String grade = "";
	String grade2 = "";
	
	grade = (score>=90) ? "VIP" : (score>=80 && score<90) ? "GOLD" : "NORMAL";
	if(gender.equals("M")) {
		grade = "M" + grade;
	}else {
		grade = "F" + grade;
	}
	System.out.printf("%s, %4.2f\n", grade, score);

	
	// (2)
	grade2 = (gender.equals("M")) ?
		((score >= 90) ? "MVIP" : (score >= 80) ? "MGOLD" : "MNORMAL") :
		((score >= 90) ? "FVIP" : (score >= 80) ? "FGOLD" : "FNORMAL") ;
		
	System.out.printf("%s, %4.2f\n", grade2, score);

	}

}
