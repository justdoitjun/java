package com.kbstar.service;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeCartNumber;

public class CartCRUDServiceImpl implements CRUDService<String, Cart> {
	DAO<String, String, Cart> dao;

	@Override
	public void register(Cart v) throws Exception {
		v.setId(MakeCartNumber.makeCartNum());
		try {
		dao = new CartDaoImpl();
		dao.insert(v);
		}catch(Exception e){
			if (e instanceof SQLRecoverableException) {
				throw new Exception("Network Error...Check IP address");
			} else{
				throw e;
			}
		}
	}

	@Override
	public void modify(Cart v) throws Exception {
		try {
			dao = new CartDaoImpl();
			dao.update(v);
		} catch (SQLRecoverableException e) {
			throw new Exception("서비스 장애.");
		} catch (SQLException e1) {
			e1.printStackTrace();
			throw new Exception("id가 없습니다.");
		} catch (Exception e2) {
			e2.printStackTrace();
			throw new Exception("예상치 못한 오류입니다.");
		}
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao = new CartDaoImpl();
			dao.delete(k);
		} catch (Exception e) {
			
			if(e instanceof SQLRecoverableException) {
				throw new Exception("Network Error...Check your IP Address.");
			}else {
				throw new Exception("The cart number you chose doesn't exist.\nCheck the cart number carefully.");
			}
		}
	}

	@Override
	public Cart get(String k) throws Exception {
		Cart cart = null;
		dao = new CartDaoImpl();
		try {
			cart = dao.select(k);
			System.out.println("get 성공");
		} catch (SQLRecoverableException e) {
			throw new Exception("서비스 장애.");
		} catch (SQLException e1) {
			throw new Exception("id가 없습니다.");
		} catch (Exception e2) {
			e2.printStackTrace();
			throw new Exception("예상치 못한 오류입니다.");
		}
		return cart;
	}

	@Override
	public List<Cart> get() throws Exception {
		List<Cart> list = new ArrayList<>();
		dao = new CartDaoImpl();
		try {
		list = dao.selectAll();
		} catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("Network Error....Check your IP Address");
			}
			else if(e instanceof SQLSyntaxErrorException) {
				throw new Exception("Data doesn't exist.");
			}
		}
		return list;
	}


}
