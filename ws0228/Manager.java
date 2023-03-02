package ws0228;

public class Manager {

	//field
	public String name;
	public double salary;
	public double bonus;

	
	public Manager(){
	}//basic constructor
	
	public Manager(String name, double salary, double bonus){
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}

	//method
	public double getAnnSalary() {
		return (salary * 12.0) + bonus;
	}
	public double getTax(){
		return (salary + bonus) * 12.0 * 0.2;
	}

	@Override
	public String toString() {
		return "임원정보// 아래 선택한 임원의 이름은 " + name + " 이고, 그(그녀)의 월급은" + salary + "$ 이고, 이번 성과급은" + bonus + "입니다.";
	}
	
	
	
	
	
	
}
