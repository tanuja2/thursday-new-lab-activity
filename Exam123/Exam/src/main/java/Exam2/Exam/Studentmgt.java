package Exam2.Exam;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Studentmgt {
	int id,age;
	String name,contact;

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
				Student st1=new Student();
				System.out.println("Student id:");
				int id=input.nextInt();
				st1.setSid(id);
				
				System.out.println("Student Name");
				String name=input.next();
				st1.setSname(name);
				
				System.out.println("Student Age");
				int age=input.nextInt();
				st1.setAge(age);
				
				System.out.println("Student contact Number:");
				String contact=input.next();
				st1.setContact(contact);
				Transaction t=session.beginTransaction();
				session.save(st1);
				t.commit();
				break;
				//Case 2
			case 2:   //delete message
				System.out.println("Student id to be deleted");
				id=input.nextInt();
				Student st2 =session.get(Student.class,id);
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
				Student st3=session.get(Student.class, id);
			    if(st3!=null)
			    {
			    	input.nextLine();
			    	System.out.println("Student id:");
			    	id=input.nextInt();
			    	st3.setSid(id);
			    	
			    	System.out.println("Student Name:");
			    	 name=input.next();
			    	st3.setSname(name);
			    	
			    	System.out.println("Studet age");
			    	 age=input.nextInt();
			    	st3.setAge(age);
			    	
			    	System.out.println("Student contact Number:");
			        contact=input.next();
			        st3.setContact(contact);
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
		System.out.println("1. ADD STUDENT");
		System.out.println("2. DELETE STUDENT");
		System.out.println("3. UPDATE STUDENT");
		System.out.println("4. DISPLAY STUDENT");
		System.out.println("5. EXIT PROGRAM");
		System.out.println("Enter your selection:");
	}
	
	}
	



	            
	        

