package controllers;

import java.util.ArrayList;

import models.Borrowing;

public class BorrowingController {
	private static ArrayList<Borrowing> borrowings = new ArrayList<Borrowing>();
	
	public static boolean register(Borrowing borrowing) {
		borrowings.add(borrowing);
		return true;
	}
	
	public static ArrayList<Borrowing> list(){
		return borrowings;
	}
	
	public static ArrayList<Borrowing> listStudentborrowings (String cpf) {
		ArrayList<Borrowing> studentBorrowings = new ArrayList<Borrowing>();
		for(Borrowing registeredBorrowing: borrowings) {
			if(registeredBorrowing.getStudent().getCpf().equals(cpf)) {
				studentBorrowings.add(registeredBorrowing);
			}
		}
		return studentBorrowings;
	}
}
