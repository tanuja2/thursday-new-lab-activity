package com.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
	@Column(length=100)
	private String name;
	@Column(name="number",length=50)
	private int Contactnumber;
	private String Address;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContactnumber() {
		return Contactnumber;
	}
	public void setContactnumber(int contactnumber) {
		Contactnumber = contactnumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", Contactnumber=" + Contactnumber
				+ ", Address=" + Address + "]";
	}
	public Customer(int customerId, String name, int contactnumber, String address) {
		super();
		this.customerId = customerId;
		this.name = name;
		Contactnumber = contactnumber;
		Address = address;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
