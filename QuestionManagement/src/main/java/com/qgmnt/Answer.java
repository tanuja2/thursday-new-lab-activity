package com.qgmnt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ans")
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aId;
	@Column(name="answer")
	private String aName;
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public Answer(int aId, String aName) {
		super();
		this.aId = aId;
		this.aName = aName;
	}
	@Override
	public String toString() {
		return "Answer [aId=" + aId + ", aName=" + aName + "]";
	}
	public Answer() {
		super();
		
	}
	

}