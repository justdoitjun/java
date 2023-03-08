package com.kbstar.frame;

import java.util.List;

public interface DAO<K, V> {
	// CRUD (Create, Read, Update, Delete)
	public void insert(V v) throws Exception;

	public void update(V v) throws Exception;

	public void delete(K k) throws Exception;

	public V select(K k) throws Exception;

	public List<V> select() throws Exception;

}// end of interface
