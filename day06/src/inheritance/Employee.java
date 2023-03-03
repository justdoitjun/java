package inheritance;

public class Employee {
	// Field
	private String id;
	private String name;
	private double salary;

	
	
	//Getter-Setter as fields are private.
	public double getSalary() {
		return salary;
	}

	// Constructor
	public Employee() {
	}

	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Method
	public double getAnnSalary() {
		double result = 0.0;
		result = this.salary * 12;
		return result;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}

	
}
