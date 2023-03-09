package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Msg;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.notif.NotificationImpl;

public class UserService implements CRUDService<String, UserDTO>{
	
	UserDAO us = new UserDAO(); // 중요한 정보의 DAO를 따로 해두고
	//UserService 단에서 UserDao에 넣어야하니깐. 
//	DAO<String, UserDTO> te = null; // 그렇게 중요하지 않은 DAO를 따로 정리해둘 수도 있음. 
	Notification notif = new NotificationImpl();


	public UserService() throws Exception{
		us = null;
		notif = null;
		//예외를 UserDAO에서 던져줬으니 여기서 받아서 처리해보자. 
		//UserDAO 오류 --> UserService--> App으로 가줌. 
		//에러를 두번 던져주는 거임. 
//		try {
//		us = new UserDAO();
//		} catch(Exception e) {
//			throw new Exception("회원가입실패했구먼...이라고 에러를 새롭게 만들어서 던져주자.");
//		}
//		notif = new NotificationImpl();  //생성자 모든 걸 넣어줘야한다. 생성자의 기능이란 초기화와 기본 식탁 세팅
	}

	@Override
	public void register(UserDTO v) throws Exception {
		us.insert(v); 
		notif.sendEmail(v.getEmail(), Msg.registerMsg1); //회원가입축하
		notif.sendSMS(v.getContact(), Msg.registerMsg3); //결혼기념일 축하
	}

	@Override
	public void delete(String k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserDTO get(String k) throws Exception {
		UserDTO obj = null;
		obj = us.select(k); //UserDao의 내용ㅇㄹ 담자.
		return obj;
	}

	@Override
	public List<UserDTO> get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
