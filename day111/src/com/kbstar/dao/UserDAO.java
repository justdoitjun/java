package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO> {// 무조건 DB에 넣기 위해 만들어진 UserDAO
	// 이 클래스에는 비즈니스 로직(회원가입 등등)의 내용은 전혀 없고, DB에 넣는 것만 있다.

	HashMap<String, UserDTO> db; // 오라클을 대신해서 우리가 연습해보려고 HashMap을 써보자.

	public UserDAO() {
		db = new HashMap<>(); // 기본 생성자에서 HashMap이 계속 생길 수 있도록 생성해줘야함. 인스턴스 생성되면
		// 무조건 db가 생기도록 하는 것임.
	}

	@Override
	public void insert(UserDTO v) throws Exception {
		if (db.containsKey(v.getId())) {
			throw new Exception("E001");
		} // 실제 DB에서는 이런 코드가 필요없이 자동으로 이런 내용을 체크해준다.
		db.put(v.getId(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UserDTO v) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public UserDTO select(String k) throws Exception {
		// DB에 사용자정보가 있는데, 사용자정보를 가지고 와서 ID,PWD를 이용해서, UserDTO를 만들어서 해결해줘.
		UserDTO obj = null;
		obj = db.get(k);// DB에서 Key값을 가지고 와서 User객체를 obj에 넣어줘.
		return obj;
	}

	@Override
	public List<UserDTO> select() throws Exception {
		//// DB에서 데이터를 가지고 와서 바구니에 담아서 보여주자.
		// List는 인터페이스라서 생성을 할 수가 없다. 그래서, List의 일부인 ArrayList를 만들어주자.
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		// 위 코드는 바구니를 만드는 것과 동일하다.
		Collection<UserDTO> col = db.values();
		// db에 있는 모든 데이터를 col에 담아봐
		// 이 코드를 ArrayList에다 일부 담아줘야지.
		for (UserDTO obj : col) {
			list.add(obj);
		}

		return list;
	}

}
