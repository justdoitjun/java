package inheritance;

public class App2 {

	public static void main(String[] args) {
		// Manager(Son) contains Employee(Parents)
		//Manager is a Employee
		Employee e1 = new Manager("100", "james", 500, 50);
		//It works!!!!!!
		
		Employee ee[] = new Employee[5];
		ee[0] = new Employee("100", "james", 500);
		ee[1] = new Manager("100", "james", 500, 50); // It works!!!! Interesting!!! as manager contains employee.
		ee[2] = new Employee("100", "james", 500);
		ee[3] = new Manager("100", "james", 500, 50);
		ee[4] = new Sales("194", "jun", 500, "NewYork", 0.3);
		
		for(Employee em : ee) {
			System.out.println(em);
			System.out.println(em.getAnnSalary());
			if(em instanceof Sales) { //em 중에 Sales타입이 있다면, 
				System.out.println(((Sales) em).getIncentive()); //Sales 타입의 메소드를 이요하세요.
				
				//Sales s = (Sales)em;
				//System.out.println(s.getIncentive());
			}
		}
		
		
		//However, codes below doesn't work.
		//Employee is not a Manager
		//Manager m = new Employee("100", "james", 550);
		
		
		

	}

}
