package ws0309;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {

	public static void main(String[] args) throws wException {
		// 예외를 만들 필요없이, 그냥 if문으로 할 수도 있겠지만, 그냥 공부하는 목적으로 Exception 클래스를 새로 만들어서
		// 예외처리를 해보았습니다.
		// 문제에서 요구하는 것은 다른 클래스 없이 App과 Lotto 클래스로만 구현하는 것이지만, 오늘 배운 것을 활용해보고자합니다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("로또 대박 시스템에 온 것을 환영합니다.");
		// Thread.sleep(200);
		System.out.println("대박을 내고 싶나요?");
		// Thread.sleep(100);aa
		System.out.println("당신의 운을 고르고 싶다면 아무 키나 누르세요.\n 만약, 그러고 싶지 않다면, Q를 누르세요.");
		String command = scanner.next();

		if (command.equals("Q") || command.equals("q")) {
			System.out.println("아쉽군요. 다음에 뵙겠습니다.");
			scanner.close();
			return;
		}
		Lotto luck = new Lotto();

		System.out.println("이제 당신은 운을 모아 당신이 원하는 숫자를 1~25까지 골라주세요. 중복은 안됩니다.");
		int number1 = Integer.parseInt(scanner.next());
		if (number1 > 25 || number1 < 1) {
			scanner.close();
			throw new wException("E001"); // 범위 넘어감
		}
		System.out.println("하나 더 골라주세요. 2개 남았습니다.");
		int number2 = Integer.parseInt(scanner.next());
		if (number2 > 25 || number2 < 1) {
			scanner.close();
			throw new wException("E001"); // 범위 넘어감
		} else if (number1 == number2) {
			scanner.close();
			throw new wException("E002"); // 동일한 숫자 누름
		}
		System.out.println("당신의 운명을 결정할 마지막 조각을 결정해주세요.");
		int number3 = Integer.parseInt(scanner.next());
		if (number3 > 25 || number3 < 1) {
			scanner.close();
			throw new wException("E001"); // 범위 넘어간
		} else if (number1 == number3 || number2 == number3) {
			scanner.close();
			throw new wException("E002"); // 동일한 숫자 누름
		}

		Set<Integer> winningNum;
		winningNum = new HashSet<>();
		winningNum.add(number1);
		winningNum.add(number2);
		winningNum.add(number3);

		System.out.println("이제 추첨을 시작합니다.");
		luck.makeWinningNumberMoney();
		int yourGrade = luck.checkRanking(winningNum);

		double yourFortune = luck.prizeMoney(yourGrade);
		System.out.println("당신의 운명은 이미 결정되었습니다.");
		System.out.println("한번 더 시도하시면 당첨금은 10배로 오릅니다.\n 당신의 운명을 실험하고 싶다면, Y를, \n 여기서 만족해보고 싶다면 아무 거나 누르세요.");
		System.out.println("명심하세요. 기회는 한번 뿐입니다. 3초 뒤에 당신은 운명을 결정할 수 있습니다.");
		for (int i = 1; i < 4; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.println(4 - i);
		}
		System.out.println("당신의 선택은?");
		String iAmTestingYou = scanner.next();

		if (iAmTestingYou.equals("Y") || iAmTestingYou.equals("y")) {
			scanner.close();
			System.out.println("도박은 안됩니다.");
			return;
		}
		System.out.println("당신은 여기서 만족하기로 결정하였습니다.");
		if (yourFortune == 0.0) {
			System.out.println("당신의 운명은...죄송하지만 꽝입니다.");
		} else {
			System.out.printf("축하합니다. 당신의 당첨금은 %4.1f입니다.", yourFortune);
		}

		scanner.close();

	}

}
