package controllers;
import java.util.ArrayList;

import models.Artigo;
import models.Book;
import models.Revista;

public class ExemplarController {
	
	private static ArrayList<Book> books = new ArrayList<Book>();
	private static ArrayList<Revista> revistas = new ArrayList<Revista>();
	private static ArrayList<Artigo> artigos = new ArrayList<Artigo>();
	
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
	
	public static Boolean registerMagazine(Revista revista) {
		revistas.add(revista);
		return true;
	}
	
	public static ArrayList<Revista> showMagazines(){
		for(Revista registeredMagazine: revistas) {
			if(registeredMagazine == null) {
				return null;
			}
		}
			return revistas;
	}
	
	public static Revista searchMagazineByCode(String cod) {
		for(Revista registeredMagazine: revistas) {
			if(registeredMagazine.getCod().equals(cod)) {
				return registeredMagazine;
			}
		}
		return null;
	}
	
	public static boolean editMagazine(String cod, Revista revistaAtual, Revista revistaAtualizada) {
        for(Revista registeredMagazine:revistas) {
            if(registeredMagazine.getCod().equals(cod)) {
                var index = revistas.indexOf(revistaAtual);
                revistas.set(index, revistaAtualizada);
                return true;
            }
        }
        return false;
    }
	
	public static boolean deleteMagazine(String cod, Revista revista) {
        for(Revista registeredMagazine:revistas) {
            if(registeredMagazine.getCod().equals(cod)) {
                revistas.remove(revista);
                return true;
            }
        }
        return false;
    }
	
	public static Boolean registerArticle(Artigo artigo) {
		artigos.add(artigo);
		return true;
	}
	
	public static ArrayList<Artigo> showArticles(){
		for(Artigo registeredArticle: artigos) {
			if(registeredArticle == null) {
				return null;
			}
		}
			return artigos;
	}
	
	public static Artigo searchArticleByCode(String cod) {
		for(Artigo registeredArticle: artigos) {
			if(registeredArticle.getCod().equals(cod)) {
				return registeredArticle;
			}
		}
		return null;
	}
	
	public static boolean editArticle(String cod, Artigo artigoAtual, Artigo artigoAtualizado) {
        for(Artigo registeredArticle:artigos) {
            if(registeredArticle.getCod().equals(cod)) {
                var index = artigos.indexOf(artigoAtual);
                artigos.set(index, artigoAtualizado);
                return true;
            }
        }
        return false;
    }
	
	public static boolean deleteArticle(String cod, Artigo artigo) {
        for(Artigo registeredArticle:artigos) {
            if(registeredArticle.getCod().equals(cod)) {
                artigos.remove(artigo);
                return true;
            }
        }
        return false;
    }


}
