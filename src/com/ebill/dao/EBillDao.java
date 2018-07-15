package com.ebill.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ebill.entities.Consumer;

public class EBillDao implements IEBillDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager manager;
	
	public EBillDao() {
	manager = factory.createEntityManager();
	
	/*Consumer check = new Consumer();
	
	manager.getTransaction().begin();
	
	check.setConsumerName("JOHN");
	check.setConsumerAddress("CHENNAI");
	
	manager.persist(check);
	
	manager.getTransaction().commit();
	*/
	
	
	}

	@Override
	public ArrayList<Consumer> getAllDetials() {
		
		ArrayList<Consumer> list = null;
		
		try {
			String jpql = "SELECT con FROM Consumer con";
			
			Query qry = manager.createQuery("jpql");
			
			list = (ArrayList<Consumer>) qry.getResultList();
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		return list;
		
		
	}

	@Override
	public Consumer findById(int consumerId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

	
	
	
	
}
