package inheritance2;

public class Sales extends Employee{
	// Field
	private String loc;
	private double rate;
	//Constructor
	public Sales() {
	}
	//부모 클래스만 가져온 super Class Constructor
	public Sales(String id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}
	//부모와 자식 클래스 전부다 가져온 Constructor
	public Sales(String id, String name, double salary, String loc, double rate) {
		super(id, name, salary);
		this.loc = loc;
		this.rate = rate;
	}
	
	//method
	@Override
	public double getAnnSalary() {
		double result = 0.0;
		result = super.getAnnSalary() + (this.getIncentive()*12);
		return result;
	}
	
	public double getIncentive() {
		double result = 0.0;
		result = getSalary() * this.rate;
		return result;
	}
	
	
}
