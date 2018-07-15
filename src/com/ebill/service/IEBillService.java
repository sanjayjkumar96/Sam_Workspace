package com.ebill.service;

import java.util.ArrayList;

import com.ebill.entities.Consumer;

public interface IEBillService {

	
ArrayList<Consumer> getAllDetials();
	
	Consumer findById(int consumerId);
}
