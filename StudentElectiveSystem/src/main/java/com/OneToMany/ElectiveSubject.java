package com.OneToMany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="subject")
public class ElectiveSubject {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private  int subId;
private String subName;
@ManyToOne(cascade=CascadeType.ALL)
private Student student;

public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public int getSubId() {
	return subId;
}
public void setSubId(int subId) {
	this.subId = subId;
}
public String getSubName() {
	return subName;
}
public void setSubName(String subName) {
	this.subName = subName;
}
@Override
public String toString() {
	return "ElectiveSubject [subId=" + subId + ", subName=" + subName + "]";
}
public ElectiveSubject(int subId, String subName) {
	super();
	this.subId = subId;
	this.subName = subName;
}
public ElectiveSubject() {
	super();
	// TODO Auto-generated constructor stub
}


}
