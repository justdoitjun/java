package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kbstar.dto.Cust;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CustDaoImpl implements DAO<String, String, Cust> {

	/*---------------------------------------------------------*/
	public CustDaoImpl() {
		/* Driver Loading --------------------------------------- */
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공!");

	}

	@Override
	public void insert(Cust v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setString(4, v.getEmail());
			pstmt.setString(5, v.getContact());
			pstmt.executeUpdate();
		} catch (SQLException e1) {
			throw e1;
		}
	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql);) {
			pstmt.setString(1, k);

			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("id를 확인해주세요");
			}
			System.out.println(result);
		} catch (Exception e1) {
			throw e1;
		}

	}

	@Override
	public void update(Cust v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.updateSql);) {

			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setString(3, v.getEmail());
			pstmt.setString(4, v.getContact());
			pstmt.setString(5, v.getId());

			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("변경 내용을 확인해주세요");
			}
			System.out.println(result);
		} catch (SQLException e1) {
			throw e1;
		}

	}

	@Override
	public Cust select(String k) throws Exception {
		Cust cust = null;

		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectSql);) {
			pstmt.setString(1, k);

			try (ResultSet rset = pstmt.executeQuery();) {
				rset.next();
				String id = rset.getString("id");// 
				String pwd = rset.getString("pwd");
				String name = rset.getString("name");
				String email = rset.getString("email");
				String contact = rset.getString("contact");

				cust = new Cust(id, pwd, name, email, contact);// 객체생성
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}

		return cust;

	}

	@Override
	public List<Cust> selectAll() throws Exception {
		List<Cust> list = new ArrayList<>();
		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql);){
			try(ResultSet rset = pstmt.executeQuery();){
				while(rset.next()) {
					Cust cust = null;
					
					String id = rset.getString("id");// 
					String pwd = rset.getString("pwd");
					String name = rset.getString("name");
					String email = rset.getString("email");
					String contact = rset.getString("contact");

					cust = new Cust(id, pwd, name, email, contact);
					list.add(cust);
				}

			} catch (Exception e) {
				throw e;
			}

		} catch (Exception e) {
			throw e;
		}
		return list;
	}

	@Override
	public List<Cust> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}