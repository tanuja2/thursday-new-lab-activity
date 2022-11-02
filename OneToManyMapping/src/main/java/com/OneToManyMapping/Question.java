package com.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ques")
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int qId;
private String qName;
@OneToMany(cascade=CascadeType.ALL)
List<Answer>answer;
public int getqId() {
	return qId;
}
public void setqId(int qId) {
	this.qId = qId;
}
public String getqName() {
	return qName;
}
public void setqName(String qName) {
	this.qName = qName;
}
public Question() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Question [qId=" + qId + ", qName=" + qName + "]";
}
public Question(int qId, String qName) {
	super();
	this.qId = qId;
	this.qName = qName;
}
public void setAnswerName(ArrayList<Answer> list1) {
	// TODO Auto-generated method stub
	
}

}
