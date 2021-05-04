package views;

import controllers.BookController;
import models.Book;

public class ListBooks {

	public static void Render() {
		System.out.println("\n -- LISTAR PRODUTOS --\n");
		
		for(Book registeredBook: BookController.showBooks()) {
			System.out.println(registeredBook);
		}

	}

}
