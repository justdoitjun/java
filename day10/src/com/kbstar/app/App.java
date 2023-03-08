package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.UserService;

import bank.MakeMessage;
import bank.WeirdException;

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
			}//end of if statement;
			else if(cmd.equals("i")) {
				System.out.println("ID?");
				String id = sc.next();
				System.out.println("pwd?");
				String pwd = sc.next();
				System.out.println("name?");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				try {
					service.register(user);
				}catch(WeirdException e) {
					System.out.println(MakeMessage.makeMessage(e.getMessage()));
				}
			}
			else if(cmd.equals("d")) {
				System.out.println("ID");
				String id = sc.next();
				try {
					service.delete(id);
				}catch(WeirdException e) {
					System.out.println(MakeMessage.makeMessage(e.getMessage()));
				}
			} // Service에 throws를 해놓고선 예외처리 안하니깐 에러나는 거임. 
			else if(cmd.equals("u")) {
				System.out.println("Update?");
				System.out.println("pwd?");
				String pwd = sc.next();
				System.out.println("name?");
				String name = sc.next();
				UserDTO user = new UserDTO(pwd, name);
				try {
					service.update(user);
				}catch(WeirdException e) {
					System.out.println(MakeMessage.makeMessage(e.getMessage()));
				}
			}
		}//end of while statement;
		sc.close();
	}//end of main method;


}
