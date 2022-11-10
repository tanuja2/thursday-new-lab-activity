package com.Employee;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Emp_Id;
	
	@Column(length=100)
	private String Emp_name;
	
	@Column(name="empaddress",length=50)
	private String Address;
	private int salary;
	public int getEmp_Id() {
		return Emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		Emp_Id = emp_Id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int emp_Id, String emp_name, String address, int salary) {
		super();
		this.Emp_Id = emp_Id;
		this.Emp_name = emp_name;
		this.Address = address;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [Emp_Id=" + Emp_Id + ", Emp_name=" + Emp_name + ", Address=" + Address + ", salary=" + salary
				+ "]";
	}
   
}

