package com.OneToManyMapping;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//import javax.persistence.Table;




@Entity
//@Table(name="solution")
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int aId;
private String answerName;

@ManyToOne(cascade=CascadeType.ALL)
private Question question;

public Question getQuestion() {
	return question;
}
public void setQuestion(Question question) {
	this.question = question;
}
public int getaId() {
	return aId;
}
public void setaId(int aId) {
	this.aId = aId;
}
public String getAnswerName() {
	return answerName;
}
public void setAnswerName(String answerName) {
	this.answerName = answerName;
}
public Answer(int aId, String answerName) {
	super();
	this.aId = aId;
	this.answerName = answerName;
}
@Override
public String toString() {
	return "Answer [aId=" + aId + ", answerName=" + answerName + "]";
}
public Answer() {
	super();
	
}

}
