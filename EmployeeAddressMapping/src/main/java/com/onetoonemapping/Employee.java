package com.onetoonemapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int employeeId;
private String name,email;

@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
//@JoinColumn(name="aid")
private Address address;
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", name=" + name + ", email=" + email + "]";
}
public Employee(int employeeId, String name, String email) {
	super();
	this.employeeId = employeeId;
	this.name = name;
	this.email = email;
}
public Employee() {
	super();
	
}

}
