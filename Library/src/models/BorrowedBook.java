package models;

public class BorrowedBook {
		
	private Book book;

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "\nBorrowed Book: " + book;
	}
	
}
