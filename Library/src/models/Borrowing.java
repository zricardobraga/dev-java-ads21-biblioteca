package models;
import java.time.LocalDate;
import java.util.ArrayList;


public class Borrowing {
	
	private Student student;
	private ArrayList<BorrowedBook> borrowedBook;
	private ArrayList<BorrowedMagazine> borrowedMagazine;
	private ArrayList<BorrowedScientificArticle> borrowedScientificArticle;
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
	
	public ArrayList<BorrowedMagazine> getBorrowedMagazine() {
		return borrowedMagazine;
	}

	public void setBorrowedMagazine(ArrayList<BorrowedMagazine> borrowedMagazine) {
		this.borrowedMagazine = borrowedMagazine;
	}

	public ArrayList<BorrowedScientificArticle> getBorrowedScientificArticle() {
		return borrowedScientificArticle;
	}

	public void setBorrowedScientificArticle(ArrayList<BorrowedScientificArticle> borrowedScientificArticle) {
		this.borrowedScientificArticle = borrowedScientificArticle;
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
		return "\nStudent: " + getStudent().getName() + 
				"\nBorrowed Books: " + borrowedBook.toString() +
				"\nBorrowed Magazines: " + borrowedMagazine.toString() +
				"\nBorrowed Scientific Articles: " + borrowedScientificArticle.toString() +
				"\nBorrowing Date: " + getBorrowingDate() + 
				"\nReturn Date: " + getReturnDate();
	}

}
