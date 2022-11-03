package com.OneToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentElectiveSubject {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		ElectiveSubject es=new ElectiveSubject();
		es.setSubName("physics");
		ElectiveSubject es1=new ElectiveSubject();
		es1.setSubName("chemistry");
		ArrayList<ElectiveSubject>list=new ArrayList<ElectiveSubject>();
		list.add(es);
		list.add(es1);
		
		ElectiveSubject es2=new ElectiveSubject();
		es2.setSubName("business");
		ElectiveSubject es3=new ElectiveSubject();
		es3.setSubName("accounts");
		ArrayList<ElectiveSubject>list2=new ArrayList<ElectiveSubject>();
		list2.add(es2);
		list2.add(es3);

        Student s=new Student();
        s.setName("tanuja");
        s.setEs(list);
        
        Student s2=new Student();
        s2.setName("somya");
        s2.setEs(list2);
         
        
        
        es.setStudent(s);
        es1.setStudent(s);
        es2.setStudent(s2);
        es3.setStudent(s2);
        
        
        session.save(es);
        session.save(es1);
        session.save(es2);
        session.save(es3);
        session.save(s);
        session.save(s2);
        session.getTransaction().commit();
		factory.close();

	}

}
