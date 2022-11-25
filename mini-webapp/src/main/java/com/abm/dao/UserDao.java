package com.abm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.abm.entity.User;



public class UserDao {

	/*public void store(User user) {
		//read the persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(user); //persist method will generate insert query
		
		tx.commit();
		
		em.close();
		emf.close();
	}*/
	

	public User fetchByUserName(String username){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select  u from User u where u.username = :user");//HQL//jpql
		q.setParameter("user", username);
		User user = (User) q.getSingleResult();
		em.close();
		emf.close();
		return user;
	}
	
	public void updateLocalDate(String local){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.merge(local);//persist method will generate insert query
		
		tx.commit();
		
		em.close();
		emf.close();
	}
	

}
