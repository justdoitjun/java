package ifcontrol;

public class P87 {

	public static void main(String[] args) {
		String grade = "";
		Double sum = 99.6;
		System.out.println("Start...");
		
		grade = (sum >= 90) ?  "VIP" : (sum >= 70) ? "Gold" : "silver";	
		System.out.println(grade);
		


	}

}
