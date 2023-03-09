package com.kbstar.notif;

import com.kbstar.frame.Notification;

public class NotificationImpl implements Notification {
	//실제 이 클래스에서는 E-mail과 SMS를 보낸다. 
	@Override
	public void sendEmail(String email, String msg) throws Exception {
		System.out.printf("%s에게 %s를 전송합니다.\n",email,msg);
	}

	@Override
	public void sendSMS(String contact, String msg) throws Exception {
		System.out.printf("%s에게 %s를 전송합니다.\n",contact,msg);
		
	}

}
