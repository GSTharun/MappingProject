package com.ty.OneToOneBi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.OneToOneBi.dto.Adhaar;
import com.ty.OneToOneBi.dto.Person;

public class PersonDao 
{
	
	public void savePerson(Person person)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("tharun");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Adhaar adhaar=person.getAdhaar();
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(adhaar);
		entityTransaction.commit();
	}

}
