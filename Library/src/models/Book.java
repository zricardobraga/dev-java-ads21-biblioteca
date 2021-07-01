package models;

import java.util.Date;

public class Book extends Exemplar {
	
	private String editora;
	private String autor;
	private String isbn;
	
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "Book \nEditora: " + getEditora() + "\nAutor: " + getAutor() + "\nISBN: " + getIsbn();
	}
	
	
	
	
}
