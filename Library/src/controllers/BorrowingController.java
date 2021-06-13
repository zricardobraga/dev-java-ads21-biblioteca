package controllers;
import java.util.ArrayList;
import models.Borrowing;
import models.Book;
import models.BorrowedBook;
import models.Student;

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
	
	public static ArrayList<Borrowing> listStudentBorrowings (String cpf) {
		ArrayList<Borrowing> studentBorrowings = new ArrayList<Borrowing>();
		for(Borrowing registeredBorrowing: borrowings) {
			if(registeredBorrowing.getStudent().getCpf().equals(cpf)) {
				studentBorrowings.add(registeredBorrowing);
			}
		}
		return studentBorrowings;

	}
	
	public static boolean edit(String cpf, Borrowing oldBorrow, Borrowing newBorrow) {
        for(Borrowing borrowingRegistred: borrowings) {
            if(borrowingRegistred.getStudent().getCpf().equals(cpf)) {
                var index = borrowings.indexOf(oldBorrow);
                borrowings.set(index, newBorrow);
                return true;
            }
        }
        return false;
    }
	
	public static boolean delete(String studentCpf, ArrayList<Borrowing> borrowingByStudent) {
        for(Borrowing registeredBorrowing:borrowings) {
            if(registeredBorrowing.getStudent().getCpf().equals(studentCpf)) {
                borrowings.remove(borrowingByStudent);
                return true;
            }
        }
        return false;
    }
}	
