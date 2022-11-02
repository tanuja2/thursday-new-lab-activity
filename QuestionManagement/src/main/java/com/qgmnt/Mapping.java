package com.qgmnt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mapping {
	public static void main(String args[])
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		//one to one mapping
		Question q1=new Question();
		q1.setqName("what is java");
		Answer a1=new Answer();
		a1.setaName("java is object oriented programming language");
		q1.setAnswer(a1);
		session.save(a1);
		session.save(q1);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		
	}

}