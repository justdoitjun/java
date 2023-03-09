package com.kbstar.frame;

public interface Notification {
	// 목적은 Service에서 DB에 데이터 넣는 DAO도 거치지만, Service에서 SMS, Email보내는 것도 해야하므로.

	// 추상메소드를 적자. 기능의 틀만.
	public void sendEmail(String email, String msg) throws Exception; // E-mail 보내고

	public void sendSMS(String contact, String msg) throws Exception; // SMS 보내고

}
