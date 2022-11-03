package com.HqlPractice;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLQuery {

	
		public static void main(String[] args) {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session=factory.openSession();
			session.beginTransaction();
			//insertion in HQL:
			Employee e=new Employee();
			e.setId(1);
			e.setName("tanuja");
			e.setSalary(25000);
			session.save(e);
			
			
			Employee e1=new Employee();
			e1.setId(2);
			e1.setName("anchal");
			e1.setSalary(20000);
			session.save(e1);
			session.getTransaction().commit();
			
			//select all rows using HQL;
			/*Query q=session.createQuery("from Employee");
			List list=q.getResultList();
			System.out.println(list);*/
			
	//updation in HQL;
			/*session.beginTransaction();
			Query query=session.createQuery("update Employee set name=:n where id=:i");
			query.setParameter("n", "diya");
			query.setParameter("i", 2);
			int status=query.executeUpdate();
			System.out.println(status);
			session.getTransaction().commit();*/
			/*session.close();
			factory.close();*/
			
			//delete in Hql;
			/*session.beginTransaction();
			Query query=session.createQuery("delete from Employee where id=2");
			int status=query.executeUpdate();
			System.out.println("no of delete is "+status);
			session.close();
			factory.close();*/
			
			
			//aggreagate functions in Hql;
			
			
			Query q=session.createQuery("select sum(salary)from Employee");
			List<Double> list=q.list();
			System.out.println(list);
			
			
			
			

			Query q2=session.createQuery("select max(salary)from Employee");
			List<Double> list2=q2.list();
			System.out.println(list2);
			
			
			
			

			Query q3=session.createQuery("select min(salary)from Employee");
			List<Double> list3=q3.list();
			System.out.println(list3);
			

			Query q4=session.createQuery("select avg(salary)from Employee");
			List<Double> list4=q4.list();
			System.out.println(list4);
			
			



	}

}
