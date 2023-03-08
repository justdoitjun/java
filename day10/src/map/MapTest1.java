package map;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {
		Map<Integer, String> a = new HashMap<Integer, String>();
		a.put(1, "A");
		a.put(2, "B");
		a.put(1, "C");
		
		System.out.println(a.size());
		System.out.println(a.containsKey(6));
		System.out.println(a.containsKey(1));
		System.out.println("위는 Key값이 있는지 없는지 / 아래는 Value값이 있는지 없는지");
		System.out.println(a.containsValue("F"));
		System.out.println(a.containsValue("A"));
		System.out.println("위는 boolean값만 나오지만, 아래는 Key를 통해 Value에 뭐가 있는지 찾을 수 있다. ");
		System.out.println(a.get(1));
	}//end of main

}//enf of class
