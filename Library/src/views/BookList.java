package views;

import controllers.ItemController;
import models.Book;

public class BookList {

	public static void Render() {
		System.out.println("\n -- BOOKS --\n");
		
		for(Book registeredBook: ItemController.showBooks()) {
			System.out.println(registeredBook);
		}
	}
}