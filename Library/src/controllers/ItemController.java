package controllers;
import java.util.ArrayList;
import models.Book;
import models.Magazine;
import models.ScientificArticle;

public class ItemController {
	
	private static ArrayList<Book> books = new ArrayList<Book>();
	private static ArrayList<Magazine> magazines = new ArrayList<Magazine>();
	private static ArrayList<ScientificArticle> scientificArticles = new ArrayList<ScientificArticle>();

	//Book
	public static Boolean registerBook (Book book) {
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
	
	public static Book searchBookByCode(String cod) {
		for(Book registeredBook: books) {
			if(registeredBook.getCod().equals(cod)) {
				return registeredBook;
			}
		}
		return null;
	}
	
	public static boolean editBook(String cod, Book oldBook, Book newBook) {
        for(Book registeredBook:books) {
            if(registeredBook.getCod().equals(cod)) {
                var index = books.indexOf(oldBook);
                books.set(index, newBook);
                return true;
            }
        }
        return false;
    }
	
	public static boolean deleteBook(String cod, Book book) {
        for(Book registeredBook:books) {
            if(registeredBook.getCod().equals(cod)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

	//Magazine
	public static Boolean registerMagazine(Magazine magazine) {
		magazines.add(magazine);
		return true;
	}
	
	public static ArrayList<Magazine> showMagazines(){
		for(Magazine registeredMagazine: magazines) {
			if(registeredMagazine == null) {
				return null;
			}
		}
			return magazines;
	}
	
	public static Magazine searchMagazineByCode(String cod) {
		for(Magazine registeredMagazine: magazines) {
			if(registeredMagazine.getCod().equals(cod)) {
				return registeredMagazine;
			}
		}
		return null;
	}
	
	public static boolean editMagazine(String cod, Magazine oldMagazine, Magazine newMagazine) {
        for(Magazine registeredMagazine:magazines) {
            if(registeredMagazine.getCod().equals(cod)) {
                var index = magazines.indexOf(oldMagazine);
                magazines.set(index, newMagazine);
                return true;
            }
        }
        return false;
    }
	
	public static boolean deleteMagazine(String cod, Magazine magazine) {
        for(Magazine registeredMagazine:magazines) {
            if(registeredMagazine.getCod().equals(cod)) {
                magazines.remove(magazine);
                return true;
            }
        }
        return false;
    }

	//Scientific Article
	public static Boolean registerScientificArticle(ScientificArticle article) {
		scientificArticles.add(article);
		return true;
	}
	
	public static ArrayList<ScientificArticle> showScientificArticles(){
		for(ScientificArticle registeredArticle: scientificArticles) {
			if(registeredArticle == null) {
				return null;
			}
		}
			return scientificArticles;
	}
	
	public static ScientificArticle searchScientificArticleByCode(String cod) {
		for(ScientificArticle registeredArticle: scientificArticles) {
			if(registeredArticle.getCod().equals(cod)) {
				return registeredArticle;
			}
		}
		return null;
	}
	
	public static boolean editScientificArticle(String cod, ScientificArticle oldArticle, ScientificArticle newArticle) {
        for(ScientificArticle registeredArticle:scientificArticles) {
            if(registeredArticle.getCod().equals(cod)) {
                var index = scientificArticles.indexOf(oldArticle);
                scientificArticles.set(index, newArticle);
                return true;
            }
        }
        return false;
    }
	
	public static boolean deleteScientificArticle(String cod, ScientificArticle article) {
        for(ScientificArticle registeredArticle:scientificArticles) {
            if(registeredArticle.getCod().equals(cod)) {
                scientificArticles.remove(article);
                return true;
            }
        }
        return false;
    }
}