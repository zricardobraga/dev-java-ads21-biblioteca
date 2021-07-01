package views;

import java.util.Scanner;
import controllers.ExemplarController;
import models.Book;

public class FindBooksByCod {
	private static Scanner sc = new Scanner(System.in);
	private static Book book;
	private static String cod;
	
	public static void render() {
		book = new Book();
		System.out.println("\n".repeat(15));
		System.out.println("\n-- SEARCH BOOK BY CODE --\n");
		System.out.println("\nEnter Book Cod: ");
		cod = sc.nextLine();
		book = ExemplarController.seachBookByCode(cod);
		if(book != null) {
			System.out.println(book);
		}else {
			System.out.println("Book not found");
		}
	}
}
