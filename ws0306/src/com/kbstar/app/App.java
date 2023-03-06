package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.UserService;

public class App {

	public static void main(String[] args) {
		Service<String, UserDTO> service = new UserService();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input command(q,i,d,u)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("i")) {
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input NAME...");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				service.register(user);
			}else if(cmd.equals("d")) {
				System.out.println("Input ID...");
				String id = sc.next();
				service.remove(id);
			}else if(cmd.equals("u")) {
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input NAME...");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				service.modify(user);
			}
		}
		sc.close();
	}

}
