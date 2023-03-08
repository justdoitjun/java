package com.kbstar.frame;

import bank.WeirdException;

public interface DAO<K,V> {
	String IP = "127.0.0.1";
	
	public void insert(V v) throws WeirdException;
	public void modify(V v) throws WeirdException;
	public void remove(K k) throws WeirdException;
}
