package com.spring.rest.curd.dao;

import java.util.List;

import com.spring.rest.curd.model.Payment;

public interface PaymentDao {
	
	public String payNow(Payment payment);
	
	public List<Payment> getTransactionInfo(String vendor);

}
