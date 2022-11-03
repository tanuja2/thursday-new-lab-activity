package com.OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="stu")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int StudentId;
private String name;
@OneToMany(cascade=CascadeType.ALL)
List<ElectiveSubject>es;

public List<ElectiveSubject> getEs() {
	return es;
}
public void setEs(List<ElectiveSubject> es) {
	this.es = es;
}
public int getStudentId() {
	return StudentId;
}
public void setStudentId(int studentId) {
	StudentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [StudentId=" + StudentId + ", name=" + name + "]";
}
public Student(int studentId, String name) {
	super();
	StudentId = studentId;
	this.name = name;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

}
