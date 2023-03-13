package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsetTest3 {

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
		Connection con = null;
		PreparedStatement pstmt = null;
		// Statement register - SQL

		// Statement transmission - SQL

		try {
			con = DriverManager.getConnection(url, id, pwd);
			pstmt = con.prepareStatement(insertSql);
			pstmt.setString(1, "id13");
			pstmt.setString(2, "pwd10");
			pstmt.setString(3, "hong");
			pstmt.setInt(4, 50);
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("close failure");
				e.printStackTrace();
			}
			System.out.println("Closure Success");
		}

		// Result

		// Close

	}

}
