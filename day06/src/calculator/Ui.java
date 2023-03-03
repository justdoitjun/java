package calculator;
// 값을 넣어주는 곳(Front)
public class Ui {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result = cal.sum(10, 20);    //실제 화면
		System.out.println(result);
		cal.save(result);
		
		System.out.println("Well Done!");
	}

}
