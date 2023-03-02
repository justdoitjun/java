package aggregation;

public class Car {
	public String name;
	public String color;
	public int size;



	public Car() {
		name = "k1";
		//this.name 
		color = "red";
		size = 1000;
	}
	public Car(String name, String color, int size) {
		this.name = name; //힙메모라(2001).
		this.color = color;
		this.size = size;
	}
	//생성자(constructor) 
	

	public void go() {
		System.out.printf("%s, %s Go car...\n", this.name, this.color);
	}

	public void stop() {
		System.out.println(this.color + "Stop Car...");
	}
	// 행위(= 함수= 메소드)를 이렇게 정해주고...

}
