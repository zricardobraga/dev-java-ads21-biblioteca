package controllers;
import java.util.ArrayList;
import models.Book;

public class BookController {
	
	private static ArrayList<Book> books = new ArrayList<Book>();
	
	public static Book findBookByCode(int cod) {
		for(Book registeredBook: books) {
			if(registeredBook.getCod() == cod) {
				return registeredBook;
			}
		}
		return null;
	}
	
	public static Boolean register (Book book) {
		if (findBookByCode(book.getCod()) == null) {
			books.add(book);
			return true;
		}
		return false;
	}
	
	public static ArrayList<Book> showBooks(){
		return books;
	}  

}
