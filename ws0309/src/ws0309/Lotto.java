package ws0309;

import java.util.*;

public class Lotto {
	private Set<Integer> winningNum;
	private double prizeMoney;

	public Lotto() {
		winningNum = new HashSet<>();
		prizeMoney = 0.0;
	}

	// 당첨 번호와 당첨 금액 생성
	public void makeWinningNumberMoney() {
		Random random = new Random();
		while (winningNum.size() < 3) {
			winningNum.add(random.nextInt(25) + 1);
		}
		prizeMoney = random.nextDouble() * 2_000_000_000;
	}

	// 본인이 입력한 숫자 3개를 인자로 전달받고 등수를 반환
	public int checkRanking(Set<Integer> myNum) {
		int count = 0;
		for (int num : myNum) {
			if (winningNum.contains(num)) {
				count++;
			}
		}
		switch (count) {
		case 1:
			return 3; // 3등
		case 2:
			return 2; // 2등
		case 3:
			return 1; // 1등
		default:
			return 4; // 꽝
		}
	}

	// 등수 정보를 인자로 전달받고 당첨 금액을 반환
	public double prizeMoney(int grade) {
		switch (grade) {
		case 1:
			return prizeMoney; // 1등
		case 2:
			return prizeMoney * 0.5; // 2등
		case 3:
			return prizeMoney * 0.05; // 3등
		default:
			return 0.0; // 꽝
		}
	}
}
