package com.onetoonemapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int addressId;
private String addressLine,city,State,country;
private int pincode;
@OneToOne
private Employee employee;

public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public String getAddressLine() {
	return addressLine;
}
public void setAddressLine(String addressLine) {
	this.addressLine = addressLine;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", addressLine=" + addressLine + ", city=" + city + ", State=" + State
			+ ", country=" + country + ", pincode=" + pincode + "]";
}
public Address(int addressId, String addressLine, String city, String state, String country, int pincode) {
	super();
	this.addressId = addressId;
	this.addressLine = addressLine;
	this.city = city;
	State = state;
	this.country = country;
	this.pincode = pincode;
}
public Address() {
	super();
	
}

}
