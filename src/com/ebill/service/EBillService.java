package com.ebill.service;

import java.util.ArrayList;

import com.ebill.dao.EBillDao;
import com.ebill.entities.Consumer;

public class EBillService implements IEBillService {

	EBillDao dao = new EBillDao();
	
	@Override
	public ArrayList<Consumer> getAllDetials() {
		
		return dao.getAllDetials();
	}

	@Override
	public Consumer findById(int consumerId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
