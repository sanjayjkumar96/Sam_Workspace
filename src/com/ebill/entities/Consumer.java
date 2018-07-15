package com.ebill.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consumer implements Serializable {

	
	@Override
	public String toString() {
		return "Consumer [ConsumerId=" + ConsumerId + ", ConsumerName=" + ConsumerName + ", consumerAddress="
				+ consumerAddress + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ConsumerId;
	private String ConsumerName;
	private String consumerAddress;
	public int getConsumerId() {
		return ConsumerId;
	}
	/*public void setConsumerId() {
		ConsumerId = (int) (999*Math.random());
	}*/
	public String getConsumerName() {
		return ConsumerName;
	}
	public void setConsumerName(String consumerName) {
		ConsumerName = consumerName;
	}
	public String getConsumerAddress() {
		return consumerAddress;
	}
	public void setConsumerAddress(String consumerAddress) {
		this.consumerAddress = consumerAddress;
	}
	
	
	
	
	
	
	
	
}
