package com.kbstar.test;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

public class UserSelectGetTest {
	public static void main(String[] args) throws Exception {
	CRUDService<String, UserDTO> se = new UserService();
	UserDTO obj1 = new UserDTO("id01", "pwd01", "james1", "a@google.com", "01012345678");

	try {
		se.register(obj1);
		System.out.println("=====================");
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
}
