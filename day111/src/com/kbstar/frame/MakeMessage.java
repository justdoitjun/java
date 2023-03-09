package com.kbstar.frame;

public class MakeMessage {
	public static String makeMessage(String code) {
		String result = "";
		switch(code) {
		case "ER001" : result = "계좌 개설실패"; break;
		case "ER002" : result = "음수 입력" ; break;
		case "ER003" : result = "잔액 부족" ; break;
		default : result = "고객센터에 문의하세요";
		}
		return result;
		
	}//end of method
}//end of class
