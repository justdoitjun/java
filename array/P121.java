package array;

import java.util.Scanner;

public class P121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
Loop1 :	while (true) {
			System.out.println("Input Command[q,i,s]");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Quit...");
				break Loop1; // Loop1 전체 탈출
			} else if (cmd.equals("i")) {
				System.out.println("Insert..."); // 고객 이름, ID, PW 입력
				System.out.println("Input ID ..");
				String id = sc.next();				// ID값 입력
				System.out.println("Input PASSWORD ..");
				String pw = sc.next();				// PW값 입력
				System.out.println("Input NAME ..");
				String name = sc.next();				// NAME값 입력
				System.out.printf("$s, $s, $s Inserted... \n", id, pw, name);
				break Loop1;
			} else if (cmd.equals("s")) {
				System.out.println("Select...");
			} else {
				System.out.println("Invalid Command...");
				System.out.println("Try Again...");
			}
		} // end while
		System.out.println("Bye...");
		sc.close();
	}

}
