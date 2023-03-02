package aggregation;

public class Human {
	//Field
	private String name;
	private Car car;
	//Constructor
	public Human() {
	}
	
	public Human(String name) {
		this.name = name;
	}

	public Human(String name, Car car) {
		this.name = name;
		this.car = car;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", car=" + car + "]";
	}
	public void setCar() {
		
	}
	public void drive() {
		car.go();
	}
	public void stopCar() {
		car.stop();
	}
	
	
	
}
