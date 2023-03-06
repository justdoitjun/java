package com.kbstar.frame;

public interface Service<K,V> {
	public void register(V v);
	public void delete(K k);
	public void update(V v);
	public void remove(String k);
}
