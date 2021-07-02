package views;

import java.util.Scanner;

import controllers.BorrowingController;
import models.Borrowing;

public class BorrowingFindById {
	private static Scanner sc = new Scanner(System.in);
	private static Borrowing borrow;
	private static Integer id;
	
	public static void render() {
		borrow = new Borrowing();
		System.out.println("\n".repeat(15));
		System.out.println("\n-- SEARCH BORROW BY ID --\n");
		System.out.println("\nEnter BORROW'S ID: ");
		id = sc.nextInt();
		borrow = BorrowingController.searchBorrowingById(id);
		if(borrow != null) {
			System.out.println(borrow);
		}else {
			System.out.println("Borrow not found");
		}
	}
}
