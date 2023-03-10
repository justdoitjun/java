package ws0309;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App2 {

	public static void main(String[] args) throws wException {
		// 어제 제출했지만, 그냥 재미삼아 게임을 더 만들어보았습니다.
		Scanner scanner = new Scanner(System.in);
		Double yourMoney = 1000.0;
		int cnt = 1;

		while (true) {
			System.out.println("로또 대박 시스템에 온 것을 환영합니다.");
			System.out.println("===============게임 소개 시작============");
			System.out.println("1. 당신에게는 1000달러가 주어집니다.");
			System.out.println("2. 한번 도전할 때마다 당신은 300달러를 지불해야만 운명을 실험할 수 있습니다.");
			System.out.println("3. 지금이라도 당장 멈추면 1000달러를 가져갈 수 있습니다.");
			System.out.println("하지만, 당신이 조금 더 야수의 심장을 가졌다면, 도전할 수 있습니다.");
			System.out.println("4. 가진 돈을 전부 다 사용하면 파산할 수 있다는 걸 명심하세요.");
			System.out.println("===============게임 소개 끝 ============");
			System.out.println("당신의 운을 고르고 싶다면 아무 키나 누르세요.\n만약, 그러고 싶지 않다면, Q를 누르세요.");
			String command = scanner.next();

			if (command.equals("Q") || command.equals("q")) {
				System.out.println("아쉽군요. 다음에 뵙겠습니다.");
				System.out.println("당신은 1000달러를 가지고 떠났습니다.");
				scanner.close();
				return;
			}
			Lotto luck = new Lotto(); // 게임 시작.

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
				throw new wException("E001"); // 범위 넘어감
			} else if (number1 == number3 || number2 == number3) {
				scanner.close();
				throw new wException("E002"); // 동일한 숫자 누름
			}

			Set<Integer> winningNum; // 선택한 숫자를 Set로 받음.
			winningNum = new HashSet<>();
			winningNum.add(number1);
			winningNum.add(number2);
			winningNum.add(number3);
			System.out.println("===========주사위를 모두 던졌습니다.=========");
			System.out.println("이제 추첨을 시작합니다.");
			luck.makeWinningNumberMoney();
			int yourGrade = luck.checkRanking(winningNum);

			double yourFortune = luck.prizeMoney(yourGrade);
			System.out.println("당신의 운명은 이미 결정되었습니다.");
			System.out.println("당신의 운명을 확인해보고 싶나요? 지금이라도 당신은 여기서 그만 둘 수 있습니다.");
			System.out.println("그만두고 1000달러만 가져가려면 Y를 누르세요. 선택은 돌이킬 수 없습니다.");
			System.out.println("============선택완료========");
			String iAmTestingYou = scanner.next();
			if (iAmTestingYou.equals("Y") || iAmTestingYou.equals("y")) {
				scanner.close();
				System.out.println("당신은 게임을 종료했습니다.");
				System.out.printf("%d번만의 도전 끝에 당신의 재산은 %4.0f 달러가 되었습니다.", cnt, yourMoney);
				return;
			} // Y를 누른 경우.
			System.out.println("당신은 300달러를 사용해서 당신의 운명을 알아보기로 했습니다."); // N을 누른 경우.
			yourMoney -= 300.0;
			if (yourFortune == 0.0) {
				System.out.println("당신의 운명은...죄송하지만 꽝입니다."); // 꽝이 나온 경우.
				System.out.printf("당신의 현재 재산은 ....%4.0f입니다.", yourMoney);
			} else {
				yourMoney += yourFortune;
				System.out.printf("축하합니다. 당신의 당첨금은 %4.1f입니다.", yourFortune);
				System.out.printf("당신의 현재 재산은 ....%4.0f입니다.", yourMoney);
			}

			if (yourMoney < 0) {
				System.out.println("당신은 파산하셨습니다.");
				scanner.close();
				return;
			}

			System.out.println("혹시 다음 기회를 더 노려보고 싶은가요?\n\n고민할 시간 3초 드리겠습니다.");
			for (int i = 1; i < 4; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

				}
				System.out.println(4 - i);
			}
			System.out.println("다시 한번 도전하고 싶다면...R을 누르세요.");
			String reTry = "";
			reTry = scanner.next();
			// if (reTry.equals("R") == false || reTry.equlas("r") == false)
			// 이건 통하지 않는다. 이유는? 연산자간의 순위때문에. R이랑 r도 다 되게 하고 싶은데 아직 잘 모르겠음.
			if (!reTry.equals("R")) {
				System.out.println("다음 기회에 뵙겠습니다.");
				scanner.close();
				break; // Y나 y가 아닌 것을 눌러서 종료함.
			}
			cnt++;
			System.out.printf("%d번째 도전입니다.\n", cnt);
			System.out.println("=================================");
		} // while
		scanner.close();
		System.out.printf("%d번만의 도전 끝에 당신의 재산은 %4.0f 달러가 되었습니다.", cnt, yourMoney);

	}

}
