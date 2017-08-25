package rog.bookstore.book;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import rog.bookstore.entity.Book;
import rog.bookstore.services.book.BookService;

@ManagedBean(name="bookBean")
@SessionScoped
public class BookBean implements Serializable {
	
	private ArrayList<Book> bookList;
	private BookService bs;
	

	public BookBean() throws Exception {
		super();
		bookList = new ArrayList<Book>();
		bs = new BookService();
//		em.getTransaction().begin();
//		em.persist(new Book("Harry Potter i Czara Ognia", "Bardzo fajna, Asi się podobałą :)", 8, new SimpleDateFormat("dd-mm-yyyy").parse("24-08-2017"), true));
//		em.persist(new Book("Cylinder van Troffa", "Uwielbiam książki Zajdla", 10, new SimpleDateFormat("dd-mm-yyyy").parse("15-08-2017"), true));
//		em.persist(new Book("Niezwyciężony", "Klasyka polskiej fantastyki.", 7, new SimpleDateFormat("dd-mm-yyyy").parse("14-04-2017"), true));
//		em.persist(new Book("Wyjśćie z cienia", "Aluzja do losu Polski podczas panowania komunizmu", 9, new SimpleDateFormat("dd-mm-yyyy").parse("04-07-2017"), true));
//		
//		em.getTransaction().commit();
//		em.close();
		System.out.println("chyba sie udalo");
	}

	

	
	public List<Book> getBookList() {
		return bs.getBookList();
	}



	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}


	
	
	
	
	

}
