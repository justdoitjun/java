package com.kbstar.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kbstar.dto.Cust;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

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
	}// Driver Loading - in Constructor
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
		Cust cust = null;
		try(Connection con = getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.selectSql);){
			pstmt.setString(1, k);
			
			try(ResultSet rset = pstmt.executeQuery()){
				rset.next();
				String id = rset.getString("id");
				String pwd = rset.getString("pwd");
				String name = rset.getString("name");
				int age = rset.getInt("age");
				cust = new Cust(id,pwd,name, age);
			}catch(Exception e) {
				throw e; // 여기서 던진 건....
			}
		}catch(Exception e) { // 여기로 와서
			throw e; //여기서 다시 던진다.
		}
		return cust;
	}
		
	

	@Override
	public List<Cust> selectAll() throws Exception {
		List<Cust> list = new ArrayList<>();
		try(Connection con = getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql);){
			try(ResultSet rset = pstmt.executeQuery()){
				while(rset.next()) {
					Cust cust = null;
					String id = rset.getString("id");
					String pwd = rset.getString("pwd");
					String name = rset.getString("name");
					int age = rset.getInt("age");
					cust = new Cust(id,pwd,name,age);
					list.add(cust);
				}
			}catch(Exception e) {
				throw e;
			}
		}catch(Exception e) {
			throw e;
		}
		return list;
	}

	@Override
	public List<Cust> search(String k) throws Exception {
		Cust cust = null;
		
		return null;
	}

}
