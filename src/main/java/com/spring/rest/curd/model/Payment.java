package com.spring.rest.curd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Payment_Table")
public class Payment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4501753715497967062L;
	@Id
	@GeneratedValue
	private int id;
	private String transactionId;
	private String vendor;
	private Date paymentDate;
	private double amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(String transactionId, String vendor, Date paymentDate, double amount) {
		super();
		this.transactionId = transactionId;
		this.vendor = vendor;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}

}
