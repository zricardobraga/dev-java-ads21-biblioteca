package views;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.BookController;
import controllers.BorrowingController;
import controllers.StudentController;
import models.Book;
import models.BorrowedBook;
import models.Borrowing;
import models.Student;

public class BorrowingRegister {
	private static Borrowing borrowing;
	private static Student student;
	private static Book book;
	private static BorrowedBook borrowedBook;
	private static ArrayList<BorrowedBook> books;
	private static String studentCpf, bookCod;
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void render () {
		borrowing = new Borrowing();
		student = new Student();
		books = new ArrayList<BorrowedBook>();
		
		System.out.println("\n".repeat(10));
		System.out.println("\n-- Borrowing Register --\n");
		
		System.out.println("Enter student CPF: ");
		studentCpf = sc.nextLine();
		student = StudentController.searchByCpf(studentCpf);
	
		if(student != null) {
			borrowing.setStudent(student);
			
			String option = "";
			
			do {
				 System.out.println("\nEnter the code of the book you want: ");
			     bookCod = (sc.next());
			     book = BookController.seachBookByCode(bookCod);
			     
			     if(book != null) {
			    	 borrowedBook = new BorrowedBook();
			    	 borrowedBook.setBook(book);
			    	 books.add(borrowedBook);
			    	 borrowedBook.getBook().setStatus("UNAVAILABLE");
			    	 System.out.println("Book successfully added");
			     }else {
			    	 System.out.println("Book not found");
			     }
			     
			     borrowing.setBorrowedBook(books);
			     BorrowingController.register(borrowing);
			     
			     System.out.println("\nBorrowing successfully registered");
			     
			     System.out.println("Do you want to add another book?");
			     option = sc.next();
			} while (option.toUpperCase().equals("S"));
		} else {
			System.out.println("Student not found");
		}
		System.out.println(borrowing.toString());
	}	
}
