package views;

import java.util.Scanner;

import controllers.ExemplarController;
import models.Book;

public class BookFindByCode {
	private static Scanner sc = new Scanner(System.in);
	private static Book book;
	private static String cod;
	
	public static void render() {
		book = new Book();
		System.out.println("\n".repeat(15));
		System.out.println("\n-- SEARCH BOOK BY CODE --\n");
		System.out.println("\nEnter Book Code: ");
		cod = sc.nextLine();
		book = ExemplarController.searchBookByCode(cod);
		if(book != null) {
			System.out.println(book);
		}else {
			System.out.println("Book not found");
		}
	}
}
