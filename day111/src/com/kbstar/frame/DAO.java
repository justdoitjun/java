package com.kbstar.frame;

import java.util.List;

// DB 에 입력, 삭제, 수정, 조회는 기본 기능이다. 
public interface DAO<K, V> {
	public void insert(V v) throws Exception;

	public void delete(K k) throws Exception;

	public void update(V v) throws Exception;

	public V select(K k) throws Exception; // Key값을 찾으면, Value값이 리턴되도록 해줘라.

	public List<V> select() throws Exception; // 아무것도 안넣었지만, Value 전부가 리스트로 나오게 해줘라.

}
