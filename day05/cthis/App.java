package cthis;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		
		Date d = new Date();
		//java.sql.Date dk = new Date(); // 이건 불가능하다. 이름이 똑같은 클래스 이름을 만들 수는 없다.
		java.sql.Date dd = new java.sql.Date(0);

	}

}
