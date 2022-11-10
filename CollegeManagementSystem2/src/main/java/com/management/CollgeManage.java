package com.management;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class CollgeManage {
	private int College_id;
	private String cource;
	private int fees;

	
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
					College c=new College();
					System.out.println("College id:");
					int id=input.nextInt();
				    c.setCollege_Id(id);	
					System.out.println("Course Name");
					String course=input.next();
					c.setCource(course);;
					
					System.out.println("College fees");
					int fees=input.nextInt();
					c.setFees(fees);;
					
					
				    
					Transaction t=session.beginTransaction();
					session.save(c);
					t.commit();
					break;
					//Case 2
				case 2:   //delete message
					System.out.println("Enter college id to be deleted");
					id=input.nextInt();
					College c2=new College();
				    Transaction t1=session.beginTransaction();
					session.delete(c2);
					t1.commit();
					session.save(c2);
					session.close();
					break;
					//Case 3
				case 3:       //update message
					System.out.println("Enter college id to be updated");
					 id=input.nextInt();
					College c3=session.get(College.class, id);
				    if(c3!=null)
				    {
				    	input.nextLine();
				    	System.out.println("College id:");
				    	id=input.nextInt();
				    	c3.setCollege_Id(id);;
				    	
				    	System.out.println("Course Name:");
				    	course=input.next();
				    	c3.setCource(course);;
				    	
				    	System.out.println("fees");
				    	 fees=input.nextInt();
				    	c3.setFees(fees);;
				    	
				    	
				        Transaction t2=session.beginTransaction();
				        
				        session.saveOrUpdate(c3);
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
