package com.ebill.dao;

import java.util.ArrayList;

import com.ebill.entities.Consumer;

public interface IEBillDao {

	
	ArrayList<Consumer> getAllDetials();
	
	Consumer findById(int consumerId);
	
	
}
