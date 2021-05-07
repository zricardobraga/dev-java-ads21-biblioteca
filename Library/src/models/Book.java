package models;

import java.util.Date;

public class Book {
	private String cod;
	private String tittle;
	private String author;
	private String status;
	
	
	public Book () {
		setStatus("AVAILABLE"); 
	}
	
	public String getCod() {
		return cod;
	}
	
	public void setCod(String cod) {
		this.cod = cod;
	}
	
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
		
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "\nCod: " + getCod() + " | Tittle: " + getTittle() + " | Author: " + getAuthor() + " | Status: " + getStatus();
	}
}
