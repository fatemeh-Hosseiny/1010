package ir.freeland.springboot.persistence.base;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class ConverterRun {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public void sampleRun() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		
		//Save*****************************************
		transaction.begin();
		ItemDigi item = new ItemDigi();
		item.setName("os");
		item.setPrice(12);
		item.setID(1);
		item.setCategory("it is red");
    	session.persist(item);
		transaction.commit();
		
		//Select*****************************************
		transaction.begin();

		 transaction.commit();
	}
}
