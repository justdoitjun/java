package ws0228;

public class Employee {
	//field
	public  String name;
	public  double salary;
	public  double netTax;
	public  double wage;

	
	public Employee(){
	}//basic constructor
	
	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
			
	}

	//method
	public double getAnnSalary() {
		return this.salary * 12.0;
	}
	public double getTax(){
		return salary * 12.0 * 0.2;
	}
	
//	public PrintStream getInfo() {
//		return System.out.printf("%s, %4.2f, %4.2f, %4.2f", name, salary, getAnnSalary(), getTax());
//	}  시도해보다가 안된 것

	@Override    // 이 내용을 듣다가 졸았는지 몰라서 해맸음...
	public String toString() {
		return "직원정보// 아래 선택한 직원의 이름은 " + name + " 이고, 그(그녀)의 월급은 " + salary + " $ 입니다.";
	}




	
	
}
