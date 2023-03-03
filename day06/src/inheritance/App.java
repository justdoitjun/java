package inheritance;

public class App {

	public static void main(String[] args) {
		Employee emp1 = new Employee("100", "james", 500);
		System.out.println(emp1);
		System.out.println(emp1.getAnnSalary());
		
		Manager m1 = new Manager("200", "Kim", 500, 50);
		System.out.println(m1);


	}

}
