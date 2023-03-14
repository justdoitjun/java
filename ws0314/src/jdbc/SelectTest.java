package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

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
		String deleteSql = "SELECT * FROM cust WHERE id = ? ;"
				+ "";

		try(Connection con =  DriverManager.getConnection(url, id, pwd); 
			PreparedStatement pstmt = con.prepareStatement(deleteSql);){
			pstmt.setString(1, "id01");
			
			try(ResultSet rset = pstmt.executeQuery()){
				rset.next();
				String did = rset.getString("id");
				String dpwd = rset.getString("pwd");
				String dname = rset.getString("name");
				int dage = rset.getInt("age");
				System.out.println(did+ "/" +dpwd+"/" +dname + "/" + dage);
			}catch(SQLException e){
				e.printStackTrace();
			}
			
		} catch (SQLException e1) {
				e1.printStackTrace();
		} 

		// Result

		// Close

	}

}
