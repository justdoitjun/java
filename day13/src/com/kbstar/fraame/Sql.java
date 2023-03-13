package com.kbstar.fraame;

public class Sql {
	public static String deleteSql = "Delete from cust where id = ?";
	public static String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";
	public static String updateSql = "Update cust SET pwd = ?, name = ?, age = ? where id = ?";
	public static String selectSql = "SELECT * FROM cust WHERE id = ? ;";
	public static String selectAllSql = "SELECT * FROM cust;";
}
