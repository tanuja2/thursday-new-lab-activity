package com.hibernatebasics.HibernateExam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_inf")
public class Employee1 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	
	@Column(name="name",length=50)
	private String empName;
	
	@Column(length=100)
	private String address;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee1(int empId, String empName, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	public Employee1() {
		super();
		
	}
	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	}
	


