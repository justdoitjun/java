package com.kbstar.frame;

public interface DAO<K,V> {
	public void insert(V v);
	public void modify(V v);
	public void remove(K k);
}
