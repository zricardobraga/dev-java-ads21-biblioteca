package views;
import java.util.Scanner;

import controllers.BookController;
import controllers.BorrowingController;
import controllers.StudentController;

import java.time.LocalDate;
import java.util.ArrayList;
import models.BorrowedBook;
import models.Book;
import models.Borrowing;
import models.Student;

public class BorrowingRegister {
	
	private static ArrayList<BorrowedBook> booksList;
	private static BorrowedBook borrowedBook;
	private static Student student;
	private static Borrowing borrowing;
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void render() {
		student = new Student();
		borrowing = new Borrowing();
		String opcao = "";
		System.out.println("\n".repeat(10));
		System.out.println("\n-- REGISTER BORROW --");
		
		System.out.println("Enter the student CPF:");
		var studentFound = StudentController.searchByCpf(sc.next());
		
		if(studentFound == null)
		{
			System.out.println("No such student registred");
		}else {
			
			borrowing.setStudent(studentFound);
			do {
				borrowedBook = new BorrowedBook();
				System.out.println("Enter the book's code:");
				Book currentBook = BookController.findBookByCode(sc.nextInt());
				
				if(currentBook == null)
				{
					System.out.println("No such book registred");
				}
				
				borrowedBook.setBook(currentBook);
				
				booksList.add(borrowedBook);
				
				System.out.println("Do you want to borrow another book? (Y/N)");
				opcao = sc.next();
				
			}while(opcao.toUpperCase().equals("Y"));
			
			borrowing.setBorrowedBook(booksList);
			
			System.out.println("Borrow registred!");
		}
	}
}
