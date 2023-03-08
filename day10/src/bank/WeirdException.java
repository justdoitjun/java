package bank;

public class WeirdException extends Exception {
	private String code;
	private String line;

	public WeirdException(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}// end of getCode method : Error 코드를 출력하게함. 유지보수 용이하게.

	public String getLine() {
		if (this.code == "E001") { // deposit 입금할 때 잘못 입력한 경우.
			line = "0보다 작은 수를 넣을 수는 없습니다.";
		} else if (this.code == "E002") { // withdraw 출금할 때 돈이 없는 경우.
			line = "잔액이 부족한 경우입니다.";
		} else if (this.code == "E003") { // constructor 에 음수가 들어간 경우
			line = "balance에 0값을 넣을 수는 없습니다.";
		}
		return line;
	}// end of getLine method : Error 사유를 출력해서 사용자가 error내용을 인지할 수 있게 함.

	public void printMessage() {
		System.out.println("Error 번호 : " + getCode() + "\n Error 상세정보 : " + getLine());
	}// end of printMessage method. getCode 와 get Line을 합쳐서 출력하도록 함.
}