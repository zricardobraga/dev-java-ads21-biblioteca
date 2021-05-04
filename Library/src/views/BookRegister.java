package views;

import java.util.Scanner;

import controllers.BookController;
import models.Book;

public class BookRegister {
	private static Book book;
	private static Scanner sc = new Scanner(System.in);
	
	public static void render() {
		book = new Book();
		System.out.println("\n".repeat(10));
		System.out.println("\n-- REGISTER BOOKS --  \n");				
		System.out.println("Enter book tittle: ");
		book.setTittle(sc.next());
		
		if(BookController.register(book)) {
			System.out.println("Book successfully registered!");
		}else {
			System.out.println();
		}
	}
}
