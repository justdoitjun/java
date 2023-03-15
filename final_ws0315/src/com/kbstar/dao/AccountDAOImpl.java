package com.kbstar.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.kbstar.dto.Account;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;
public class AccountDAOImpl implements DAO<String, String, Account> {
	
	@Override
	public void insert(Account v) throws Exception { // 계좌 신규
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.accountInsertSql);) {
			pstmt.setString(1, v.getAccNo());
			pstmt.setDouble(2, v.getBalance());
			pstmt.setString(3, v.getUser_name());
			pstmt.executeUpdate();
			try {
				if (v.getBalance() < 0) {
					throw new Exception("계좌 개설 잔액은 음수가 될 수 없습니다. 예치하세요.");
				}
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
	}
	@Override
	public void delete(String k) throws Exception { // 계좌 해지
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.accountDeleteSql);) {
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate(); // 위에서 작성한 쿼리문을 업데이트함
			if (result == 0) {
				System.out.println(result); // 정상 처리되면 1, 안되면 0이 돌아옴
				throw new Exception("지정하신 AccountNumber는 존재하지 않습니다. 주의깊게 확인해보세요.");
			}
		} catch (Exception e1) {
			throw e1;
		}
	}
	@Override
	public void update(Account v) throws Exception { // 계좌 제신
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.accountUpdateSql);) {
			pstmt.setDouble(1, v.getBalance());
			pstmt.setString(2, v.getUser_name());
			pstmt.setString(3, v.getAccNo());
			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("아무 것도 반영되지 않았습니다. 내용을 확인하세요.");
			}
		} catch (Exception e) {
			throw e;
		}
	}
	@Override
	public Account select(String k) throws Exception {
		Account account = null;
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.accountSelectSql)) {
			pstmt.setString(1, k);
			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next();
				String accNo = rset.getString("accNo");
				Double balance = rset.getDouble("balance");
				String user_name = rset.getString("user_name");
				account = new Account(accNo, balance, user_name);
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
		return account;
	}
	@Override
	public List<Account> selectAll() throws Exception {
		List<Account> list = new ArrayList<>();
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.accountSelectAllSql);) {
			try (ResultSet rset = pstmt.executeQuery()) {
				while (rset.next()) {
					Account account = null;
					String accNo = rset.getString("accNo");
					Double balance = rset.getDouble("balance");
					String user_name = rset.getString("user_name");
					account = new Account(accNo, balance, user_name);
					list.add(account);
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
	public List<Account> search(String k) throws Exception { // 사용하지 않음.
		return null;
	}
}