package db;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		DAO dao = new MariaDBDAO();
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
				dao.insert(user);
			}
			else if(cmd.equals("d")) {
				System.out.println("ID");
				String id = sc.next();
				dao.delete(id);
			}
			else if(cmd.equals("u")) {
				System.out.println("Update?");
				System.out.println("pwd?");
				String pwd = sc.next();
				System.out.println("name?");
				String name = sc.next();
				UserDTO user = new UserDTO(pwd, name);
				dao.update(user);
			}
		}//end of while statement;
		sc.close();
	}//end of main method;

}
