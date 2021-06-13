package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.BorrowingController;
import models.Borrowing;

public class BorrowingDelete {
	
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Borrowing> borrowingByStudent;
	private static String cpfStudent;
	
	public static void render() {
		borrowingByStudent = new ArrayList<Borrowing>();
		System.out.println("\n".repeat(15));
		System.out.println("\n-- LIST BORROWING BY STUDENT --\n");
		System.out.println("\nEnter CPF Student: ");
		cpfStudent = sc.next();
		borrowingByStudent = BorrowingController.listStudentBorrowings(cpfStudent);
		BorrowingController.delete(cpfStudent, borrowingByStudent);
        System.out.println("Borrowing successfully deleted!");
		}
	}
