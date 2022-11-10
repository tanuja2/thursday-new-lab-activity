package com.Employee;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Employee.Employee;
public class EmployeeSys {
	int Emp_Id;
    String Emp_name;
    static String Address;
	int salary;
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		//creating Scanner object to read input
		Scanner input=new Scanner(System.in);
		//Creating option integer variable
		int option=0;
		//do-while loop
		do
		{
			menu();
			option=input.nextInt();
			//switch case begins
			switch(option)
			{
			//Case 1
			case 1:      
				Employee e1=new Employee();
				System.out.println("Employee id:");
				int id=input.nextInt();
				e1.setEmp_Id(id);				
				System.out.println("Employee Name");
				String name=input.next();
				e1.setEmp_name(name);
				
				System.out.println("Employee address");
				String Adress=input.next();
				e1.setAddress(Adress);
				
				System.out.println("Employee Salary");
				int salary=input.nextInt();
				e1.setSalary(salary);
			    
				Transaction t=session.beginTransaction();
				session.save(e1);
				t.commit();
				break;
				//Case 2
			case 2:   //delete message
				System.out.println("Enter id to be deleted");
				id=input.nextInt();
				Employee e2 =session.get(Employee.class,id);
			    Transaction t1=session.beginTransaction();
				session.delete(e2);
				t1.commit();
				session.save(e2);
				session.close();
				break;
				//Case 3
			case 3:       //update message
				System.out.println("Enter id to be updated");
				 id=input.nextInt();
				Employee e3=session.get(Employee.class, id);
			    if(e3!=null)
			    {
			    	input.nextLine();
			    	System.out.println("Employee id:");
			    	id=input.nextInt();
			    	e3.setEmp_Id(id);
			    	
			    	System.out.println("Employee Name:");
			    	 name=input.next();
			    	e3.setEmp_name(name);
			    	
			    	System.out.println("Employee address");
			    	 Address=input.next();
			    	e3.setAddress(Address);
			    	
			    	System.out.println("Salary");
			       salary=input.nextInt();
			     e3.setSalary(salary);
			        
			        Transaction t2=session.beginTransaction();
			        
			        session.saveOrUpdate(e3);
			        t2.commit();
			      
			    	
			    }
			    else
			    {
			    	System.out.println("id not found");
			    	
			    }
			    session.close();
			    factory.close();

				break;
				//Case 4
			case 4:
				
				
				break;
				//Case 5
			case 5:
				
				
				break;
				//Case 91
			case 9:            //display message
				System.out.println("thank you for using the code.Goodbye!\n");
				System.exit(0);
				break;
				
			case 7:
				default:
					System.out.println("\n invalid input\n");					
					break;
			
			}
		}
		//checking condition
		while(option!=9);  
		
		
	}
	
	 	//Method 2
	//Menu - Static menu for displaying options
	public static void menu()
	{
		//printing statements displaying menu on console
		System.out.println("MENU");
		System.out.println("1. ADD EMPLOYEE");
		System.out.println("2. DELETE EMPLOYEE");
		System.out.println("3. UPDATE EMPLOYEE");
		
		System.out.println("Enter your selection:");
	}
	

	}


