package ifcontrol;

import java.util.Scanner;

public class P93 {

	public static void main(String[] args) {
		//숫자를 4개의 2자리수를 입력 받는다. 
		//평균과 합계를 구합니다.
		//단, 만약 2자리 수가 아니면 프로그램 종료.
		
		//평균이 90이상이면 A
		//평균이 80이상이면 B
		//평균이 70이상이면 C
		//평균이 60이상이면 D
		//60 미만이면 F
		
		//합계, 평균, 학점을 출력하시오. 
	
			
		Scanner sc = new Scanner(System.in); //입력을 받을 건데 화면에서 입력을 받겠습니다.
		//이 걸 연다는 건 OS에다 빨대를 꼽는 것이기 때문에  반드시 sc.close();를 해줘야합니다.
		int ko = 0;
		int en = 0;
		int ma = 0;
		int si = 0;
		int sum = 0;
		Double avr = 0.0;
		String credit = "";
		
		System.out.println("국어성적 입력 :"); 
		//ㄴ 이건 안써도 됩니다.
		ko = Integer.parseInt(sc.next());
		//화면에서 입력받는 모든 타입은 string입니다. 그래서 우리가 string을 많이 배우는 겁니다.
		//웹에서 입력받는 것도 마찬가지입니다.
		if(ko<10 || ko>=100) {
			sc.close();
			System.out.println("입력오류. 2자리수로 입력하세요.");
			return;
		}
		System.out.println("영어성적 입력 :"); 
		//ㄴ 이건 안써도 됩니다.
		en = Integer.parseInt(sc.next());
		if(en<10 || en>=100) {
			sc.close();
			System.out.println("입력오류. 2자리수로 입력하세요.");
			return;
		}
		System.out.println("수학성적 입력 :"); 
		//ㄴ 이건 안써도 됩니다.
		ma = Integer.parseInt(sc.next());
		if(ma<10 || ma>=100) {
			sc.close();
			System.out.println("입력오류. 2자리수로 입력하세요.");
			return;
		}
		System.out.println("과학성적 입력 :"); 
		//ㄴ 이건 안써도 됩니다.
		si = Integer.parseInt(sc.next());
		if(si<10 || si>=100) {
			sc.close();
			System.out.println("입력오류. 2자리수로 입력하세요.");
			return;
		}
		
		sum =  ko + en + ma + si;
		avr =  (double) sum / 4.0;
		
		if((100>ko && ko>=10)&&(100>en && en>=10)&&(100>ma && ma>=10)&&(100>si && si>=10)) {
			if(avr>=90) {
				credit = "A";
			}else if(avr>=80) {
				credit = "B";
			}else if(avr>=70) {
				credit = "C";
			}else if(avr>=60) {
				credit = "D";
			}else {
				credit = "F";
			}
			
			System.out.printf("합계는 %d, 평균은 %4.2f, 학점은 %s", sum, avr, credit);
			sc.close();
		}
			
//		else {
//			sc.close();
//			System.out.println("입력오류. 2자리수로 입력하세요.");
//			return;
//
//		}

		sc.close();
		
		
		
		
	}
}
