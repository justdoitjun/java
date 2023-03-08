package com.kbstar.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<String,ItemDTO>{
	HashMap<String, ItemDTO> db = null;
	
	public ItemDAO(HashMap<String, ItemDTO> db) {
		this.db = db;
	}

	@Override
	public void insert(ItemDTO v) throws Exception {
		db.put(v.getID(), v);
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(db.containsKey(v.getID())) {
			throw new Exception("E001"); //해당 ID가 없다는 에러.
		}
		db.put(v.getID(), v); //ID가 혹시 있는지 확인해보고 없으면 DB에 입력함. 
	}

	@Override
	public void delete(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("E001"); //해당 ID가 없다는 에러.
		}
		db.remove(k); // 해당 관련 ID의 정보를 삭제함.
	}

	@Override
	public ItemDTO select(String k) throws Exception { // 특정한 ID의 value를 선택하고 싶은 경우.
		ItemDTO v = new ItemDTO();
		if(!db.containsKey(k)) {
			throw new Exception("E001"); //해당 ID가 없다는 에러.
		}
		if(v.getID() == k) {
			db.get(k);
		}
		return null;
	}

	@Override
	public List<ItemDTO> select() throws Exception {// 모든 ID의 key와 value를 출력하고 싶은 경우. 
		Collection <ItemDTO> x = db.values();
		
		return (List<ItemDTO>) x;
	}

}
