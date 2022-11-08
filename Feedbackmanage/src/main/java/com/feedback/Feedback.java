package com.feedback;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Feed")
public class Feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private String name;
	private int contact;
	private int Rating;
	private String Comments;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	@Override
	public String toString() {
		return "Feedback [pid=" + pid + ", name=" + name + ", contact=" + contact + ", Rating=" + Rating + ", Comments="
				+ Comments + "]";
	}
	public Feedback(int pid, String name, int contact, int rating, String comments) {
		super();
		this.pid = pid;
		this.name = name;
		this.contact = contact;
		Rating = rating;
		Comments = comments;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
}