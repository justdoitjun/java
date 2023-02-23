package variable;

public class P78 {

	public static void main(String[] args) {
			int a = 10; //RAM은 여기서 메모리에 저장한다.
			a = a + 1; //CPU는 이 때 돌아간다.
			System.out.println(a);
		
			int b = 10;
			b = --b + 1;
			System.out.println(b);
	}

}
