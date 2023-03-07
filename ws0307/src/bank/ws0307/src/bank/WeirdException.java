package bank;

public class WeirdException extends Exception {
    private String code;
	private String line;

    public WeirdException(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    public String getLine() {
    	if(this.code == "E001") {
    		line = "0보다 작은 수를 넣을 수는 없습니다.";
    	}else if(this.code == "E002") {
    		line = "잔액이 부족한 경우입니다.";
    	}else if(this.code == "E003") {
    		line = "balance에 0값을 넣을 수는 없습니다.";
    	}
        return line;
    }

    public void printMessage() {
    	System.out.println("Error 번호 : " + getCode() + "\n Error 상세정보 : "+ getLine() );
  
    }
}