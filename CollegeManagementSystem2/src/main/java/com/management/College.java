package com.management;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="Coll")
	public class College {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int College_Id;
		@Column(length=100)
		private String cource;
		private int fees;
		public int getCollege_Id() {
			return College_Id;
		}
		public void setCollege_Id(int college_Id) {
			College_Id = college_Id;
		}
		public String getCource() {
			return cource;
		}
		public void setCource(String cource) {
			this.cource = cource;
		}
		public int getFees() {
			return fees;
		}
		public void setFees(int fees) {
			this.fees = fees;
		}
		public College(int college_Id, String cource, int fees) {
			super();
			this.College_Id = college_Id;
			this.cource = cource;
			this.fees = fees;
		}
		public College() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "College [College_Id=" + College_Id + ", cource=" + cource + ", fees=" + fees + "]";
		}
		

	}
