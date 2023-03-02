package aggregation;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new Human("james");
		System.out.println(human);
		
		Car car = new Car("k1", "red", 1000);
		//human.setCar(car); // 포함관계로 넣어주고
		System.out.println(human);
		human.drive();
		human.stopCar();
	}

}
