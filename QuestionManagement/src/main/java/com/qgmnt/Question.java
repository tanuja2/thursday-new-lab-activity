package com.qgmnt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ques")
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int qId;
	@Column(name="question")
	private String qName;
	@OneToOne
	 private Answer a;
	
	public Answer getA() {
		return a;
	}
	public void setA(Answer a) {
		this.a = a;
	}
		
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
	public Question(int qId,String qName) {
		super();
		this.qId=qId;
		this.qName=qName;
	}
	public Question() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Question [qId=" + qId + ", qName=" + qName + "]";
	}
	public void setAnswer(Answer a1) {
		// TODO Auto-generated method stub
		
	}

	

}