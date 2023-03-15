package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class ItemDaoImpl implements DAO<String, String, Item> {

	public ItemDaoImpl() {
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
	public void insert(Item v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.itemInsertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getPrice());
			pstmt.setDouble(4, v.getRate());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			// throw e;
		}
	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.itemDeleteSql);) {
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate(); // 위에서 작성한 쿼리문을 업데이트함
			if (result == 0) {			
				System.out.println(result); // 정상 처리되면 1, 안되면 0이 돌아옴
				throw new Exception("id 를 확인해주세요");
			}
		} catch (Exception e1) {
			throw e1;
		}
	}

	@Override
	public void update(Item v) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.itemUpdateSql)){
		pstmt.setString(1, v.getName());
		pstmt.setInt(2,  v.getPrice());
		pstmt.setDouble(3,  v.getRate());
		pstmt.setString(4, v.getId());
		int result = pstmt.executeUpdate();
		if(result == 0) {
			throw new Exception("존재하지 않는 ID 입니다.");
			}
		} catch (SQLException e1) {
			throw e1;
		}
		
	}

	@Override
	public Item select(String k) throws Exception {
		Item item = null;
		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.itemSelectsql);){
			pstmt.setString(1, k);
			try(ResultSet rset = pstmt.executeQuery()){
				rset.next();
				String id = rset.getString("id");
				String name = rset.getString("name");
				int price = rset.getInt("price");
				double rate = rset.getDouble("rate");
				Date regdate = rset.getDate("regdate");
				item = new Item(id, name, price, rate, regdate);
			}catch(Exception e) {
				throw e;
			}
		}catch(Exception e) {
			throw e;
		}
		return item;
	}

	@Override
	public List<Item> selectAll() throws Exception {
		List<Item> list = new ArrayList<>();
		try (Connection con = getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.itemSelectAllSql);) {
			try (ResultSet rset = pstmt.executeQuery()) {
				while (rset.next()) {
					Item item = null;
					String id = rset.getString("id");
					String name = rset.getString("name");
					int price = rset.getInt("Price");
					double rate = rset.getDouble("rate");
					Date regdate = rset.getDate("regdate");
					item = new Item(id, name, price, rate, regdate);
					list.add(item);
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
	public List<Item> search(String k) throws Exception {
		List<Item> list = new ArrayList<>();
		return null;
	}

}
