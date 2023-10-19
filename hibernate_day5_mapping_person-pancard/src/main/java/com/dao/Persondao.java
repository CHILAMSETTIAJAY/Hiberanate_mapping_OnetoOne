package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dto.Pancard;
import com.dto.Person;

public class Persondao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ajay");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void insertDetails(Person person) {
		Pancard pancard = person.getPancard();
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pancard);
		entityTransaction.commit();
	}
	
	public void fetchDetails( int id) {
		Person person = entityManager.find(Person.class, id);
		
		System.err.println("__________________");
		System.out.println(person);
		System.err.println("__________________");
	}
	
	public void fetchAll() {
		Query query = entityManager.createQuery("select s from Person s");
		List list = query.getResultList();
		System.err.println("-------------------");
		System.out.println(list);
		System.err.println("-------------------");
		
	}
	public void deleteDetails(int id) {
		Person person = entityManager.find(Person.class,id);
		entityTransaction.begin();
		entityManager.remove(person);
		entityManager.remove(person.getPancard());
		entityTransaction.commit();
	}
	
	public void updateDetails(int id , Person person) {
		person.setId(id);
		person.getPancard().setPanid(id);
		entityTransaction.begin();
		entityManager.merge(person);
		entityManager.merge(person.getPancard());
		entityTransaction.commit();
	}
}
