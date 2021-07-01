package views;
import java.util.Scanner;
import controllers.ItemController;
import models.Book;

public class BookRegister {
	
	private static Book book;
	private static Scanner sc = new Scanner(System.in);
	
	public static void render() {
		book = new Book();
		System.out.println("\n".repeat(10));
		System.out.println("\n-- REGISTER BOOK --  \n");				
		System.out.println("Enter the book Code: ");
		book.setCod(sc.nextLine());
		System.out.println("Enter the book Title: ");
		book.setTitle(sc.nextLine());
		System.out.println("Enter the book Edition: ");
		book.setEdition(sc.nextLine());
		System.out.println("Enter the book Publisher: ");
		book.setPublisher(sc.nextLine());
		System.out.println("Enter the book Author: ");
		book.setAuthor(sc.nextLine());
		System.out.println("Enter the book ISBN: ");
		book.setIsbn(sc.nextLine());
		
		if(ItemController.registerBook(book)) {
			System.out.println("Book successfully registered!");
		}else {
			System.out.println();
		}
	}
}