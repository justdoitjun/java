package com.kbstar.frame;

import bank.WeirdException;

public interface Service<K,V> {
	public void register(V v) throws WeirdException;
	public void delete(K k) throws WeirdException;
	public void update(V v) throws WeirdException;
	public void remove(String k) throws WeirdException;
}
