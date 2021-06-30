package models;

public class Book extends Exemplar{

	private String publisher;
	private String author;
	private String isbn;

	public Book(){
		setType("1");
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
		
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "\nPublisher: " + getPublisher() + " | Author: " + getAuthor() + " | ISBN: " + getIsbn();
	}
}
