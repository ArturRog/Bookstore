package rog.bookstore.book;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import rog.bookstore.entity.Book;
import rog.bookstore.services.book.BookstoreService;

@ManagedBean(name="bookBean")
@SessionScoped
public class BookBean implements Serializable {
	
	private ArrayList<Book> bookList;
	@EJB private BookstoreService bs;
	

	public BookBean() throws Exception {
		super();
		bookList = new ArrayList<Book>();
	}

	

	
	public List<Book> getBookList() {
		return bs.getBookList();
	}



	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}


	
	
	
	
	

}
