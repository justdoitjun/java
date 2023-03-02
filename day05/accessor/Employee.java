package accessor;

public class Employee {
	// field에도 접근제어다 등록
	private String id; 		//다른 곳에서 아예 안보임.
	protected String name; //다른 곳에서 부를 수는 있음.
			double salary; //같은 클래스라면 어디든 부를 수 있음. 
			
	//Construcotr에도 접근제어자 등록
	Employee(){
		
	}

	//메소드에도 접근제어자 등록
	private double getAnnSalary() {
		return this.salary *12;
	}	//이 경우에는 해당 메소드는 이 클래스에서만 쓸 수 있다. 당연히 자주 일어나진 않겠지. 변수만 private이 아니고 함수도 private을 쓸 수 있다 정도까지만. 

}
