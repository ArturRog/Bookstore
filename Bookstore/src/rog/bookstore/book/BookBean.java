package rog.bookstore.book;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="bookBean")
@SessionScoped
public class BookBean implements Serializable {


	
	
	private ArrayList<Book> bookList;



	public BookBean() throws Exception {
		super();
		bookList = new ArrayList<Book>();
		bookList.add(new Book("Harry Potter i Czara Ognia", "Bardzo fajna, Asi się podobałą :)", 8, new SimpleDateFormat("dd-mm-yyyy").parse("24-08-2017")) );
		bookList.add(new Book("Cylinder van Troffa", "Uwielbiam książki Zajdla", 10, new SimpleDateFormat("dd-mm-yyyy").parse("15-08-2017")) );
		bookList.add(new Book("Niezwyciężony", "Klasyka polskiej fantastyki.", 7, new SimpleDateFormat("dd-mm-yyyy").parse("14-04-2017")) );
		bookList.add(new Book("Wyjśćie z cienia", "Aluzja do losu Polski podczas panowania komunizmu", 9, new SimpleDateFormat("dd-mm-yyyy").parse("04-07-2017")) );
		
	}


	
	
	public ArrayList<Book> getBookList() {
		return bookList;
	}



	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}


	
	
	
	
	

}
