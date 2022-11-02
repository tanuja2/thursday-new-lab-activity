package com.onetoonemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpAddressMap {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		Employee e=new Employee();
		e.setName("tanuja");
		e.setEmail("tanuja@gmail.com");
		
		Address a=new Address();
		a.setAddressLine("no.3498,sanjay colony");
		a.setCity("faridabad");
		a.setCountry("India");
		a.setPincode(121005);
		a.setState("haryana");
		e.setAddress(a);//main point
		a.setEmployee(e);//main point
		session.save(e);
		session.save(a);
		session.getTransaction().commit();
		session.close();
		factory.close();
		

	}

}
