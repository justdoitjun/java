package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		Map<Integer, String> a = new HashMap<Integer, String>();
		a.put(1, "A");
		a.put(2, "B");
		a.put(3, "C");
		a.put(4, "D");
		
		Collection<String> x = a.values();
		System.out.println(x.size());
		System.out.println("위는 사이즈입니다.");
		
		for(String y : x) {
			System.out.println(y);
		}
	}//end of main

}//enf of class
