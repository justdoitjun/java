package board;

import java.util.Scanner;

public class App {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Service service = new Service();
		String initialValue = null;
		while(true) {
			System.out.println("Input cmd(q,r,g,u,d)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("You moved out...");
				break;
			}//End of q
			else if(cmd.equals("r")) {
				System.out.println("Input contents");
				String contents = sc.next();
				initialValue = contents;
				service.register(contents);
				System.out.println("Registration complete!");
			}// End of r
			else if(cmd.equals("g")) {
				System.out.println("Input number of contents");
				int num = Integer.parseInt(sc.next());
				String result = service.get(num);
				System.out.println(result);	
			}// End of g
			else if(cmd.equals("u")) {
				if(initialValue == null) {
					System.out.println("Press `r`!");
				}else {
					System.out.println("Input the number of data rows.");
					int num = Integer.parseInt(sc.next());
					System.out.println("Good. Input what you want to modify.");
					String str = sc.next();
					service.modify(num, str);
				}
			}// End of u
			else if(cmd.equals("d")) {
				if(initialValue == null) {
					System.out.println("There is nothing what you can delete. Press r!");
				}else {
					System.out.println("Input the number of data rows.");
					int num = Integer.parseInt(sc.next());
					System.out.println("Are you sure? if you surely want to delete items. Press Y");
					String sure = sc.next();
					if(sure == "Y" || sure == "y") {
						service.remove(num);
					}else {
						System.out.println("You cancelled the delete procedure. Going back to first page.");
						break;
					}// End of 'inner if and else'	
				}// end of outer else
			}// End of d
				sc.close();
		}//End of while
		
	}//End of main
}//End of Class

