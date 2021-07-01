package models;

public class Book extends Item {

	private String publisher;
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
		
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String toString() {
		return super.toString() + "\nPublisher: " + getPublisher() + "\nISBN: " + getIsbn();
	}
}
