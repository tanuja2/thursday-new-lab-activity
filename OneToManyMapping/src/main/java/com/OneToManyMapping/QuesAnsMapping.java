package com.OneToManyMapping;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QuesAnsMapping {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		Answer ans1=new Answer();
		ans1.setAnswerName("java is a platform independent");
		Answer ans2=new Answer();
		ans2.setAnswerName("java is a robust");
		ArrayList<Answer>list1=new ArrayList<Answer>();
		list1.add(ans1);
		list1.add(ans2);
		
	
		Answer ans3=new Answer();
		ans3.setAnswerName("hibernate is a ORM tool");
		Answer ans4=new Answer();
		ans4.setAnswerName("hibernate works on POGO class");
		ArrayList<Answer>list2=new ArrayList<Answer>();
		list2.add(ans3);
		list2.add(ans4);
		
		Question q1=new Question();
		q1.setqName("what is java");
		q1.setAnswerName(list1);
		
		Question q2=new Question();
		q2.setqName("what is hibernate");
		q2.setAnswerName(list2);
		
		ans1.setQuestion(q1);
		ans2.setQuestion(q1);
		ans3.setQuestion(q2);
		ans4.setQuestion(q2);
		
		session.save(q1);
		session.save(q2);
		session.save(ans1);
		session.save(ans2);
		session.save(ans3);
		session.save(ans4);
		session.getTransaction().commit();
		factory.close();
	}

}