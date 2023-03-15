package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsetTest2 {

	public static void main(String[] args) {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver inexistence");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading Success");
		// Connect
		String id = "bank";
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.20.60:1521:XE";
		String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";

		// Statement register - SQL

		// Statement transmission - SQL

		try(Connection con =  DriverManager.getConnection(url, id, pwd); 
			PreparedStatement pstmt = con.prepareStatement(insertSql);){
			pstmt.setString(1, "id137");
			pstmt.setString(2, "pwd10");
			pstmt.setString(3, "hong");
			pstmt.setInt(4, 50);
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e1) {
			e1.printStackTrace();
		} 

		// Result

		// Close

	}

}
