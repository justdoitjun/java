package ws0309;

public class wException extends Exception {
//Exception 클래스는 사실 과제에서 요구한 사항은 아닙니다. 하지만, 공부를 하는 목적으로 준비를 해봤습니다 
	public wException(String msg) {
		if (msg == "E001") {
			System.out.println("1부터 25까지의 숫자만 넣어야합니다. 범위 외의 숫자를 넣으셔서 당신은 탈락하셨습니다.");

		} else if (msg == "E002") {
			System.out.println("모두 다른 숫자를 넣어야합니다. 동일한 숫자를 고르셨기에 당신은 탈락하셨습니다.");
		}

	}

}
