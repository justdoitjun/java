package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsetTest {

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
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
		} catch (SQLException e) {
			System.out.println("Transmission failure");
			e.printStackTrace();
			return;
		}

		// Statement register - SQL

		// Statement transmission - SQL
		String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(insertSql);
			pstmt.setString(1, "juniper137");
			pstmt.setString(2, "pwd10");
			pstmt.setString(3, "han");
			pstmt.setInt(4, 40);
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
		}

		// Result

		// Close
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

}
