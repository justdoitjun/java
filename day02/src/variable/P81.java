package variable;

import java.util.Random;
import java.util.Scanner;

public class P81 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("실수 어떤 것이든 마음에 드는 것을 넣어보세요.");
		String k = a.next();
		Double g = Double.valueOf(k);
		String result = (g>0)? "정상" : "비정상";
		System.out.println(result);
		
		//개별적으로 공부해볼려고 만든 과제
		if (result == "비정상") {
			Random newSuggestion = new Random();
			System.out.println(newSuggestion);
		}
		a.close();
	}
}


