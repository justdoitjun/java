package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.kbstar.dto.UserDTO;

public class MapTest4 {

	public static void main(String[] args) {
		Map<String, UserDTO> a = new HashMap<String,UserDTO>();
		a.put("id01", new UserDTO("id01", "pwd01","James Lebron"));
		a.put("id02", new UserDTO("id02", "pwd02","James Lebron"));
		a.put("id03", new UserDTO("id03", "pwd03","James Lebron"));
		System.out.println("id02에 있는 value값");
		UserDTO x = a.get("id02");
		System.out.println(x);
		System.out.println("모든 DB값은 아래와 같습니다. ");
		System.out.println(a);
		
		System.out.println("수정을 할수도 있는데, 수정하면 아래처럼 나옵니다. ");
		UserDTO x2 = new UserDTO("id02", "0000초기화", "James Lebron");
		a.put(x2.getId(), x2);
		System.out.println(x2);
		System.out.println("전체 사용자의 정보를 끄집어 올수도 있습니다. ");
		Collection<UserDTO> x3 = a.values();
		for(UserDTO y : x3) {
			System.out.println(y);
		}//end of for statement
		
	}//end of main

}//enf of class
