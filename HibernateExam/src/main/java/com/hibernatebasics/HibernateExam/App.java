package com.hibernatebasics.HibernateExam;
import java.util.Scanner;

//import java.lang.module.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg=new  Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory=cfg.buildSessionFactory();
      /* System.out.println("-----------------------------------for insertion or creation-------------------------------------");
       Session session=factory.openSession();
       session.beginTransaction();
       Employee1 e=new Employee1();
       e.setEmpId(5);
       e.setAddress("");
       e.setEmpName("");
       session.save(e);
       session.getTransaction().commit();
       session.close();
       factory.close();
      
      /*Session session=factory.openSession();
       session.beginTransaction();
       Employee1 e=new Employee1();
       e.setEmpId(6);
       e.setAddress("banglore");
       e.setEmpName("diya");
       session.save(e);
       session.getTransaction().commit();
       session.close();
       factory.close();*/
       
     System.out.println("----------------for updation------------");
      Session session=factory.openSession();
      session.beginTransaction();
       Scanner sc=new Scanner(System.in);
       System.out.println("enter id");
       int id=sc.nextInt();
       Employee1 upemp=session.get(Employee1.class,id);
       if(upemp!=null) {
       sc.nextLine();
    	   System.out.println("emter the name");
    	   String name=sc.nextLine();
    	   System.out.println("enter the address");
    	   String address=sc.nextLine();
    	   upemp.setEmpName(name);
    	   upemp.setAddress(address);
    	   session.saveOrUpdate(upemp);
    	   session.getTransaction().commit();
       }
       else {
    	   System.out.println("id not found");
    	   
       }
       session.close();
       factory.close();
       
       
       
     /*  System.out.println("-----------for deletion--------------");
       Session session=factory.openSession();
       session.beginTransaction();
       Scanner sc=new Scanner(System.in);
       System.out.println("enter id");
       int id=sc.nextInt();
       Employee1 delemp=session.get(Employee1.class,id);
       if(delemp!=null) {
    	   session.delete(delemp);
    	   session.getTransaction().commit();
       }
       else {
    	   System.out.println("id not found");
       }
       session.close();*/
       
    }
}
