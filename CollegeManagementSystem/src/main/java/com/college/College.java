package com.college;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coll")
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
	@Column(length=100)
private String course;
	@Column(name="teacher",length=50)
private String Tname;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getTname() {
	return Tname;
}
public void setTname(String tname) {
	Tname = tname;
}
@Override
public String toString() {
	return "College [id=" + id + ", course=" + course + ", Tname=" + Tname + "]";
}
public College(int id, String course, String tname) {
	super();
	this.id = id;
	this.course = course;
	Tname = tname;
}
public College() {
	super();
	// TODO Auto-generated constructor stub
}

}