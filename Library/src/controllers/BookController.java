package controllers;
import java.util.ArrayList;
import models.Book;

public class BookController {
	
	private static ArrayList<Book> books = new ArrayList<Book>();
	
	public static Boolean register (Book book) {
		books.add(book);
		return true;
	}
	
	public static ArrayList<Book> showBooks(){
		for(Book registeredBook: books) {
			if(registeredBook == null) {
				return null;
			}
		}
			return books;
	}
	
	public static Book seachBookByCode(String cod) {
		for(Book registeredBook: books) {
			if(registeredBook.getCod().equals(cod)) {
				return registeredBook;
			}
		}
		return null;
	}
	
	public static boolean edit(String cod, Book oldBook, Book newBook) {
        for(Book registeredBook:books) {
            if(registeredBook.getCod().equals(cod)) {
                var index = books.indexOf(oldBook);
                books.set(index, newBook);
                return true;
            }
        }
        return false;
    }
	
	public static boolean delete(String cod, Book book) {
        for(Book registeredBook:books) {
            if(registeredBook.getCod().equals(cod)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

}
