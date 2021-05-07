package models;
import java.time.LocalDate;
import java.util.ArrayList;


public class Borrowing {
	
	private Student student;
	private ArrayList<BorrowedBook> borrowedBook;
	private static LocalDate borrowingDate = LocalDate.now();
	private LocalDate returnDate;
	
	public Borrowing () {
		setReturnDate(borrowingDate.plusDays(05));
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	public ArrayList<BorrowedBook> getBorrowedBook() {
		return borrowedBook;
	}
	public void setBorrowedBook(ArrayList<BorrowedBook> borrowedBook) {
		this.borrowedBook = borrowedBook;
	}

	public LocalDate getBorrowingDate() {
		return borrowingDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	@Override
	public String toString() {
		return "\nStudent: " + getStudent().getName() + " | Borrowed Books: " + borrowedBook.toString() + " | Borrowing Date: " + getBorrowingDate() + " | Return Date: " + getReturnDate();
	}

}
