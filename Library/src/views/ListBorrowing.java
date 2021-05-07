package views;

import controllers.BorrowingController;
import models.Borrowing;

public class ListBorrowing {
	public static void render() {
		System.out.println("\n-- LIST BORROWING --\n");
		for(Borrowing registeredBorrowing : BorrowingController.list()) {
			System.out.println(registeredBorrowing);
		}
	}
	
}
