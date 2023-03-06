package com.kbstar.frame;

public interface Service<K,V> {
	public void register(V v);
	public void remove(K k);
	public void modify(V v);
}