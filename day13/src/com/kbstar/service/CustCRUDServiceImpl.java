package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dto.Cust;
import com.kbstar.fraame.CRUDService;
import com.kbstar.fraame.DAO;

public class CustCRUDServiceImpl implements CRUDService<String, Cust> {

	DAO<String, String, Cust> dao;

	public CustCRUDServiceImpl() {
		dao = new CustDaoImpl();
	}

	@Override
	public void register(Cust v) throws Exception {
		// Data Verification
		// DB Insert
		try {
			dao.insert(v);
		} catch (Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("ID 중복");
			} else {
				throw new Exception("시스템 장애입니다.");
			}
		}
		// Email, SMS
	}

	@Override
	public void modify(Cust v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다.");
			} else {
				throw new Exception("해당 ID가 존재하지 않습니다.");
			}
		}
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("해당 ID가 존재하지 않습니다.");
			}
		}
	}

	@Override
	public Cust get(String k) throws Exception {
		Cust cust = null;
		try {
		cust = dao.select(k);
		} catch(Exception e) {
			e.getMessage();
		}
		return cust;
	}

	@Override
	public List<Cust> get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
