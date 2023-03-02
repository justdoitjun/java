package cthis;

import java.util.Calendar;

public class Employee {
	// field
	public static String name;
	private String id;
	public double salary;
	public double netTax;
	public double wage;

	public Employee() {
		Calendar cal = Calendar.getInstance();
		this.id = "" + cal.get(Calendar.YEAR) + cal.get(Calendar.MILLISECOND);
	}// basic constructor

	public Employee(String name) {
		this(); // 위의 constructor가 불러와짐.
		this.name = name;
	}
	public Employee(double salary) {
		this(name); // 위의 2번째 constructor가 불러와짐.
		this.salary = salary;
	}
	
	
	
	
	
	

	// method
	public double getAnnSalary() {
		return this.salary * 12.0;
	}

	public double getTax() {
		return salary * 12.0 * 0.2;
	}

	@Override // ì�´ ë‚´ìš©ì�„ ë“£ë‹¤ê°€ ì¡¸ì•˜ëŠ”ì§€ ëª°ë�¼ì„œ í•´ë§¸ì�Œ...
	public String toString() {
		return "ì§�ì›�ì •ë³´// ì•„ëž˜ ì„ íƒ�í•œ ì§�ì›�ì�˜ ì�´ë¦„ì�€ " + name + " ì�´ê³ , ê·¸(ê·¸ë…€)ì�˜ ì›”ê¸‰ì�€ "
				+ salary + " $ ìž…ë‹ˆë‹¤.";
	}

	// Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public double getNetTax() {
		return netTax;
	}

	public double getWage() {
		return wage;
	}

}
