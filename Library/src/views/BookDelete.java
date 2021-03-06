package views;

import java.util.Scanner;

import controllers.BookController;
import models.Book;

public class BookDelete {
	private static Scanner sc = new Scanner(System.in);

    public static void render() {

        System.out.println("\n" .repeat(15));
        System.out.println("\n-- DELETE BOOK --\n");
        System.out.println("\nEnter the book code: ");
        String cod = (sc.nextLine());

        Book registeredBook = BookController.seachBookByCode(cod);

        if(registeredBook == null) {
            System.out.println("Book not found");
        }

        BookController.delete(cod, registeredBook);
        System.out.println("Book successfully deleted!");

    }
}
