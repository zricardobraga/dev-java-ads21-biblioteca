package views;


import controllers.ExemplarController;
import models.Book;

public class ListBooks {

	public static void Render() {
		System.out.println("\n -- LISTAR LIVROS --\n");
		
		for(Book registeredBook: ExemplarController.showBooks()) {
			System.out.println(registeredBook);
		}

	}

}
