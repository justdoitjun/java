package com.kbstar.frame;

public class Sql {

	// Cust DML //String id, String pwd, String name, String email, String contact
	public static String insertSql = "INSERT INTO cust VALUES(?, ?, ?, ?, ?)";
	public static String deleteSql = "DELETE FROM cust WHERE id = ?";
	public static String updateSql = "UPDATE cust SET pwd=?, name=?, email=?, contact=? WHERE id=?";
	public static String selectSql = "SELECT * FROM cust WHERE id = ?";
	public static String selectAllSql = "SELECT * FROM cust";

	// Account DML //String accNo, double balance, String user_name
	public static String accountInsertSql = "INSERT INTO account VALUES (?,?,?)";
	public static String accountDeleteSql = "DELETE FROM account WHERE accNo = ?";
	public static String accountUpdateSql = "UPDATE account SET balance = ?, user_name = ? WHERE accNo = ?";
	public static String accountSelectSql = "SELECT * FROM account WHERE accNo = ?";
	public static String accountSelectAllSql = "SELECT * FROM account";

	// Trsc DML //String tracNo, String accNo, String receiverAcc, double amount,
	// String type, String desc
	public static String trscInsertSql = "INSERT INTO  trsc VALUES(?, ?, ?, ?, ?, ?)";
//	public static String trscDeleteSql = "DELETE FROM trsc WHERE id = ?";
//	public static String trscUpdateSql = "UPDATE trsc SET cnt=? WHERE id=?";
	public static String trscSelectSql = "SELECT * FROM trsc WHERE tracNo = ?";
	public static String trscSelectAllSql = "SELECT * FROM trsc";
	public static String mytrscSelectAllSql = "SELECT * FROM trsc WHERE accNo = ?";

}