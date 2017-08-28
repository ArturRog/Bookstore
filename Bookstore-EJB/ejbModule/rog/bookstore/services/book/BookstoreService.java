package rog.bookstore.services.book;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import rog.bookstore.entity.Book;

/**
 * Session Bean implementation class BookBean
 */
@Stateless
@LocalBean
public class BookstoreService implements BookstoreLocal {

	private static final String PERSISTENCE_UNIT_NAME = "rog-persistence";

	@PersistenceContext(unitName = PERSISTENCE_UNIT_NAME)
	protected EntityManager em;	
    /**
     * Default constructor. 
     */
    public BookstoreService() {
        // TODO Auto-generated constructor stub
    }
    
    
	public List<Book> getBookList() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Book> cq = cb.createQuery(Book.class);
		Root<Book> book = cq.from(Book.class);
		cq.select(book);
		TypedQuery<Book> tq = em.createQuery(cq);
		
		List<Book> resultList = tq.getResultList();
		return resultList;
	}

}
