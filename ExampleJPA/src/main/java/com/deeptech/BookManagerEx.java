package com.deeptech;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class BookManagerEx {

	static EntityManager entityM;
	private static final EntityManagerFactory factory ;
	private static final String PERSISTENCE_UNIT_NAME="BookUnit";	

	static {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}
	public static void main(String[] args) {
		 entityM=factory.createEntityManager();
	
		entityM.getTransaction().begin();
		Book newBook = new Book();
		newBook.setTitle("Hibernate Tutor");
		newBook.setAuthor("Satyam");
		newBook.setPrice(450);
		entityM.persist(newBook);
		entityM.getTransaction().commit();
		entityM.close();
		factory.close();
	}

	
}
