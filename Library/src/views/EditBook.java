package views;

import java.util.Scanner;

import controllers.BookController;
import models.Book;

public class EditBook {
	
	private static Scanner sc = new Scanner(System.in);

    public static void render() {

        System.out.println("\n" .repeat(15));
        System.out.println("\n-- EDIT BOOK --\n");
        System.out.println("\nEnter the code of the book you want to edit: ");
        String cod = (sc.nextLine());

        if(cod == null) {
            System.out.println("Book not found");
        } else {
        	Book oldBook = BookController.seachBookByCode(cod);
            Book newBook = new Book();
            
            System.out.println("\nDigite o novo código: ");
            newBook.setCod(sc.nextLine());
            System.out.println("\nDigite o novo título: ");
            newBook.setTittle(sc.nextLine());
            System.out.println("\nDigite o novo Autor: ");
            newBook.setAuthor(sc.nextLine());
            
            BookController.edit(cod, oldBook, newBook);

            System.out.println("\nLivro editado!");
        }        
    }
}
