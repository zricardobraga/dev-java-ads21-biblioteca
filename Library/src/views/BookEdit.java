package views;

import java.util.Scanner;

import controllers.ExemplarController;
import models.Book;

public class BookEdit {
	
	private static Scanner sc = new Scanner(System.in);

    public static void render() {

        System.out.println("\n" .repeat(15));
        System.out.println("\n-- EDIT BOOK --\n");
        System.out.println("\nEnter the book's code to edit: ");
        String cod = (sc.nextLine());

        if(cod == null) {
            System.out.println("Book not found");
        } else {
        	Book oldBook = ExemplarController.searchBookByCode(cod);
            Book newBook = new Book();
            
            System.out.println("\nEnter the new Code: ");
            newBook.setCod(sc.nextLine());
            System.out.println("\nEnter the new Title: ");
            newBook.setTitle(sc.nextLine());
            System.out.println("\nEnter the new Author: ");
            newBook.setAuthor(sc.nextLine());
            System.out.println("\nEnter the new Publisher: ");
            newBook.setPublisher(sc.nextLine());
            System.out.println("\nEnter the new Edition: ");
            newBook.setEdition(sc.nextLine());
            System.out.println("\nEnter the new ISBN: ");
            newBook.setIsbn(sc.nextLine());
            
            ExemplarController.editBook(cod, oldBook, newBook);

            System.out.println("\nBook successfully edited!");
        }        
    }
}
