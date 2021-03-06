package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BankWalletAccount {
	@Id@GeneratedValue
	private int id;
	private String custName;
	private String phoneNum;
	private String email;
	private double balanceAmount;
	

	public BankWalletAccount(int id, String custName, String phoneNum, String email, double balanceAmount) {
		super();
		this.id = id;
		this.custName = custName;
		this.phoneNum = phoneNum;
		this.email = email;
		this.balanceAmount = balanceAmount;
		
	}


	public BankWalletAccount() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	@Override
	public String toString() {
		return "BankWalletAccount [id=" + id + ", custName=" + custName + ", phoneNum=" + phoneNum + ", email=" + email
				+ ", balanceAmount=" + balanceAmount + "]";
	}


}