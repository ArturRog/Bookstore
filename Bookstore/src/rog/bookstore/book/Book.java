package rog.bookstore.book;

import java.util.Date;

public class Book {

	private String nazwa;
	private String recenzja;
	private Integer ocena;
	private Date dataPrzeczytania;
	
	
	
	
	
	public Book(String nazwa, String recenzja, Integer ocena, Date dataPrzeczytania) {
		super();
		this.nazwa = nazwa;
		this.recenzja = recenzja;
		this.ocena = ocena;
		this.dataPrzeczytania = dataPrzeczytania;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getRecenzja() {
		return recenzja;
	}
	public void setRecenzja(String recenzja) {
		this.recenzja = recenzja;
	}
	public Integer getOcena() {
		return ocena;
	}
	public void setOcena(Integer ocena) {
		this.ocena = ocena;
	}
	public Date getDataPrzeczytania() {
		return dataPrzeczytania;
	}
	public void setDataPrzeczytania(Date dataPrzeczytania) {
		this.dataPrzeczytania = dataPrzeczytania;
	}
	
}
