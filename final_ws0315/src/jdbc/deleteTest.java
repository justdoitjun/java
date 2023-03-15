package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteTest {

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
		String deleteSql = "Delete from cust where id = ?";

		// Statement register - SQL

		// Statement transmission - SQL

		try(Connection con =  DriverManager.getConnection(url, id, pwd); 
			PreparedStatement pstmt = con.prepareStatement(deleteSql);){
			pstmt.setString(1, "juniper137");
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e1) {
			e1.printStackTrace();
		} 

		// Result

		// Close

	}

}
