package rog.bookstore.entity;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Book
 *
 */
@Entity(name = "book")
@SessionScoped
public class Book implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nazwa;
	private String recenzja;
	private Integer ocena;
	private Date dataPrzeczytania;
	private Boolean przeczytana; 

	private static final long serialVersionUID = 1L;

	public Book() {
		super();
	}
	public Book(String nazwa, String recenzja, Integer ocena, Date dataPrzeczytania, Boolean przeczytana) {
		super();
		this.nazwa = nazwa;
		this.recenzja = recenzja;
		this.ocena = ocena;
		this.dataPrzeczytania = dataPrzeczytania;
		this.przeczytana = przeczytana;
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

	public Boolean getPrzeczytana() {
		return przeczytana;
	}

	public void setPrzeczytana(Boolean przeczytana) {
		this.przeczytana = przeczytana;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
