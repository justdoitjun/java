package com.kbstar.frame;

public class Sql {
	//Cust DML
	public static String deleteSql = "Delete from cust where id = ?";
	public static String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";
	public static String updateSql = "Update cust SET pwd = ?, name = ?, age = ? where id = ?";
	public static String selectSql = "SELECT * FROM cust WHERE id = ? ";
	public static String selectAllSql = "SELECT * FROM cust";
	
	//Item DML
	public static String itemDeleteSql = "DELETE FROM item WHERE id = ?";
	public static String itemInsertSql = "INSERT INTO item VALUES(?,?,?,?,SYSDATE)";
	public static String itemUpdateSql = "UPDATE item SET name = ?, price = ?, rate = ? WHERE ID = ?";
	public static String itemSelectsql = "SELECT * FROM item WHERE id = ?";
	public static String itemSelectAllSql = "SELECT * FROM item";
	
	// Cart DML
	public static String cartInsertSql = "INSERT INTO cart VALUES(?, ?, ?, ?, SYSDATE)";
	public static String cartDeleteSql = "DELETE FROM cart WHERE id = ?";
	public static String cartUpdateSql = "UPDATE cart SET cnt=? WHERE id=?";
	public static String cartSelectSql = "SELECT * FROM cart WHERE id = ?";
	public static String cartSelectAllSql = "SELECT * FROM cart";
}
