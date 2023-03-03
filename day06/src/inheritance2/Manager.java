package inheritance2;

public class Manager extends Employee {
	//Field
	private double bonus;
	//Constructor
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}
	
	
//	//Over-riding
//	@Override  //a notation.
//	public double getAnnSalary() {
//		double result = 0.0;
//		result = this.getSalary() + this.bonus;
//		return result;
//	}
	
	@Override  //a notation.
	public double getAnnSalary() {
		double result = 0.0;
		result = super.getAnnSalary() + this.bonus;
		return result;
	}

	@Override
	public String toString() {
		return super.toString() + " "  + this.bonus;
	}
	
	
	
	


	
	

}
