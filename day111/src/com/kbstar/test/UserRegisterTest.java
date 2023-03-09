package com.kbstar.test;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

public class UserRegisterTest {

	public static void main(String[] args) throws Exception{
		CRUDService<String, UserDTO> se = new UserService();
		UserDTO obj1 =
		new UserDTO("id01", "pwd01", "james1", "a@google.com", "010-1234-5678");
		UserDTO obj2=
		new UserDTO("id02", "pwd02", "james2", "a2@google.com", "010-1234-5678");
		
		try {
			se.register(obj1);
			System.out.println("=====================");
			se.register(obj2);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
}
