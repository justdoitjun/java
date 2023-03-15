package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kbstar.dto.Trsc;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class TrscDAOImpl implements DAO<String, String, Trsc> {

//String tracNo, String accNo, String receiverAcc, double amount, String type, String trscDesc
	@Override
	public void insert(Trsc v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.trscInsertSql)) {
			pstmt.setString(1, v.getTracNo());
			pstmt.setString(2, v.getAccNo());
			pstmt.setString(3, v.getReceiverAcc());
			pstmt.setDouble(4, v.getAmount());
			pstmt.setString(5, v.getType());
			pstmt.setString(6, v.getTrscDesc());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public void delete(String k) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(Trsc v) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Trsc select(String k) throws Exception {
		Trsc trsc = null;
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.trscSelectSql)) {
			pstmt.setString(1, k);
			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next();
				String tracNo = rset.getString("tracNo");
				String accNo = rset.getString("accNo");
				String receiverAcc = rset.getString("receiverAcc");
				Double amount = rset.getDouble("amount");
				String type = rset.getString("type");
				String trscDesc = rset.getString("trscDesc");
				trsc = new Trsc(tracNo, accNo, receiverAcc, amount, type, trscDesc);
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
		return trsc;
	}

	@Override
	public List<Trsc> selectAll() throws Exception {
		List<Trsc> list = new ArrayList<>();
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.trscSelectAllSql)) {
			try (ResultSet rset = pstmt.executeQuery()) {
				while (rset.next()) {
					Trsc trsc = null;
					String tracNo = rset.getString("tracNo");
					String accNo = rset.getString("accNo");
					String receiverAcc = rset.getString("receiverAcc");
					Double amount = rset.getDouble("amount");
					String type = rset.getString("type");
					String trscDesc = rset.getString("trscDesc");
					trsc = new Trsc(tracNo, accNo, receiverAcc, amount, type, trscDesc);
					list.add(trsc);
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
	public List<Trsc> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
