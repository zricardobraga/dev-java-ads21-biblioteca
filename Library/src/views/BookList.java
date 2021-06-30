package views;

import controllers.ExemplarController;
import models.Book;

public class BookList {

	public static void Render() {
		System.out.println("\n -- BOOKS --\n");
		
		for(Book registeredBook: ExemplarController.showBooks()) {
			System.out.println(registeredBook);
		}
	}
}