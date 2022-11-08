package com.feedback;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class FeedbackMapping {
	int contact;
	static String name;
	static String Comments;
	int pid;
	int rating;
	
	
	

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
				Feedback st1=new Feedback();
				System.out.println("person id:");
				int id=input.nextInt();
				st1.setPid(id);
				
				System.out.println("person Name");
				String name=input.next();
				st1.setName(name);
				
				System.out.println("add rating");
				int rating=input.nextInt();
				st1.setRating(rating);
				
				System.out.println("person contact Number:");
				int contact=input.nextInt();
				st1.setContact(contact);
				
				 System.out.println("add comments");
			    String  Comments =input.next();
			    st1.setComments(Comments);
			    
				Transaction t=session.beginTransaction();
				session.save(st1);
				t.commit();
				break;
				//Case 2
			case 2:   //delete message
				System.out.println("person id to be deleted");
				id=input.nextInt();
				Feedback st2 =session.get(Feedback.class,id);
			    Transaction t1=session.beginTransaction();
				session.delete(st2);
				t1.commit();
				session.save(st2);
				session.close();
				break;
				//Case 3
			case 3:       //update message
				System.out.println("Enter id to be updated");
				 id=input.nextInt();
				Feedback st3=session.get(Feedback.class, id);
			    if(st3!=null)
			    {
			    	input.nextLine();
			    	System.out.println("person id:");
			    	id=input.nextInt();
			    	st3.setPid(id);
			    	
			    	System.out.println("person Name:");
			    	 name=input.next();
			    	st3.setName(name);
			    	
			    	System.out.println("add rating");
			    	 rating=input.nextInt();
			    	st3.setRating(rating);
			    	
			    	System.out.println("contact number");
			       contact=input.nextInt();
			     st3.setContact(option);
			      
			     
			        
			        System.out.println("add comments");
			      Comments =input.next();
			    st3.setComments(Comments);
			        
			        Transaction t2=session.beginTransaction();
			        
			        session.saveOrUpdate(st3);
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
				//Case 9
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
		System.out.println("1. ADD PERSON");
		System.out.println("2. DELETE FEEDBACK DETAIL");
		System.out.println("3. UPDATE FEEDBACK DETAIL");
		
		System.out.println("Enter your selection:");
	}
	
	}
	



	            
	        