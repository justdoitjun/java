package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.TrscDAOImpl;
import com.kbstar.dto.Trsc;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;

public class TrscCRUDServiceImpl implements CRUDService<String, Trsc> {

	DAO<String, String, Trsc> trscdao;
	
	public TrscCRUDServiceImpl() {
		trscdao = new TrscDAOImpl();
	}
	
	@Override
	public void register(Trsc v) throws Exception {
		try{
			String tracNo = MakeAccountNumber.makeTrNum();
			v.setTracNo(tracNo);
			trscdao.insert(v);	
			System.out.println("trsc register 성공");
		}catch(Exception e) {
			e.printStackTrace();
			throw new Exception("trsc register 오류");
		}
		
	}

	@Override
	public void remove(String k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Trsc v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Trsc get(String k) throws Exception {
		Trsc trsc = null;
		try {
			trsc = trscdao.select(k);
			System.out.println(trsc);
			System.out.println("trsc get 성공");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("trsc get 오류");
		}
		return trsc;
	}

	@Override
	public List<Trsc> get() throws Exception {
		List<Trsc> list = null;
		try {
			list = trscdao.selectAll();
			for (Trsc trsc : list) {
				System.out.println(trsc);
			}
			System.out.println("trsc getAll 성공");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("trsc getAll 오류");
		}
		return list;
	}

}
