package com.kbstar.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import com.kbstar.dto.Cust;
import com.kbstar.fraame.DAO;
import com.kbstar.fraame.Sql;

public class CustDaoImpl implements DAO<String, String, Cust> {

	public CustDaoImpl() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver inexistence");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading Success");
	}// Driver Loading
	
	public Connection getConnection() throws Exception {
		Connection con = null;
//properties
		Properties props = new Properties();
		String fileName = "db_info.txt";
		FileInputStream in = new FileInputStream(fileName);
		props.load(in);
		String id = props.getProperty("DB_ID"); // user01 아님!!
		String pwd = props.getProperty("DB_PWD");
		String url = props.getProperty("DB_URL");
		con = DriverManager.getConnection(url, id, pwd);
		return con;
	}
	@Override
	public void insert(Cust v) throws Exception {
		try(Connection con =  getConnection(); 
			PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);){
				pstmt.setString(1, v.getId());
				pstmt.setString(2, v.getPwd());
				pstmt.setString(3, v.getName());
				pstmt.setInt(4, v.getAge());
				int result = pstmt.executeUpdate();
			} catch (SQLException e1) {
				throw e1; // 매우 중요함. 
			}
	}//Insert

	@Override
	public void delete(String k) throws Exception {
		try(Connection con =  getConnection(); 
			PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql);){
				pstmt.setString(1, k);
				int result = pstmt.executeUpdate();
				System.out.println(result);
				if(result == 0) {
					throw new Exception("ID없음");
				}
			} catch (SQLException e1) {
				throw e1;
			} 
	}

	@Override
	public void update(Cust v) throws Exception {
		try(Connection con =  getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.updateSql);){
				pstmt.setString(1, v.getPwd());
				pstmt.setString(2, v.getName());
				pstmt.setInt(3, v.getAge());
				pstmt.setString(4, v.getId());
				int result = pstmt.executeUpdate();
				if(result == 0) {
					throw new Exception("None");
				}
			} catch (Exception e1) {
				throw e1;
			} 
	}

	@Override
	public Cust select(String k) throws Exception {
		Connection con =  getConnection(); 
		PreparedStatement pstmt = con.prepareStatement(Sql.selectSql);
		pstmt.setString(1, k);
		try {
			ResultSet rset = pstmt.executeQuery();
				rset.next();
				String did = rset.getString("id");
				String dpwd = rset.getString("pwd");
				String dname = rset.getString("name");
				int dage = rset.getInt("age");
				Cust cust = new Cust(did, dpwd, dname, dage);
		return cust;
		} catch(Exception e) {
			throw e;
		}
	}

	@Override
	public List<Cust> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cust> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
