package views;

import java.util.Scanner;

import controllers.ExemplarController;
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
        	Book oldBook = ExemplarController.seachBookByCode(cod);
            Book newBook = new Book();
            
            System.out.println("\nDigite o novo c�digo: ");
            newBook.setCod(sc.nextLine());
            System.out.println("\nDigite o novo t�tulo: ");
            newBook.setTitulo(sc.nextLine());
            System.out.println("\nDigite o novo Autor: ");
            newBook.setAutor(sc.nextLine());
            
            ExemplarController.edit(cod, oldBook, newBook);

            System.out.println("\nLivro editado!");
        }        
    }
}
