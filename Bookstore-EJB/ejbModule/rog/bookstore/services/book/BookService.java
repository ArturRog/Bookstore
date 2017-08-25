package rog.bookstore.services.book;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import rog.bookstore.entity.Book;


@Stateless
public class BookService {
	
	private static final String PERSISTENCE_UNIT_NAME = "rog-persistence";
	EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

	public EntityManager getEntityManager() {
	      return factory.createEntityManager();
	    } 
	
	public BookService() {
		// TODO Auto-generated constructor stub
	}

	
	public List<Book> getBookList() {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(new Book("test2", "test2", 10, new Date(), true));
		em.getTransaction().commit();
		em.close();
		em=getEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Book> cq = cb.createQuery(Book.class);
		Root<Book> book = cq.from(Book.class);
		cq.select(book);
		TypedQuery<Book> tq = em.createQuery(cq);
		
		List<Book> resultList = tq.getResultList();
		return resultList;
	}
	
}
