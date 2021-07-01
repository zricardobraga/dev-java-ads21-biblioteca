package views;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.ItemController;
import controllers.BorrowingController;
import controllers.StudentController;
import models.Book;
import models.BorrowedBook;
import models.BorrowedMagazine;
import models.BorrowedScientificArticle;
import models.Borrowing;
import models.Magazine;
import models.ScientificArticle;
import models.Student;

public class BorrowingRegister {
	private static Borrowing borrowing;
	private static Student student;
	private static Book book;
	private static Magazine magazine;
	private static ScientificArticle scientificArticle;
	private static BorrowedBook borrowedBook;
	private static BorrowedMagazine borrowedMagazine;
	private static BorrowedScientificArticle borrowedScientificArticle;
	private static ArrayList<BorrowedBook> books;
	private static ArrayList<BorrowedMagazine> magazines;
	private static ArrayList<BorrowedScientificArticle>	 scientificArticles;
	
	
	private static String studentCpf, type, bookCod, magazineCod, scienticAticleCod;
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void render () {
		borrowing = new Borrowing();
		student = new Student();
		books = new ArrayList<BorrowedBook>();
		magazines = new ArrayList<BorrowedMagazine>();
		scientificArticles = new ArrayList<BorrowedScientificArticle>();
		
		System.out.println("\n".repeat(10));
		System.out.println("\n-- Borrowing Register --\n");
		
		System.out.println("Enter student CPF: ");
		studentCpf = sc.nextLine();
		student = StudentController.searchByCpf(studentCpf);
	
		if(student != null) {
			borrowing.setStudent(student);
			
			String option = "";
			
			do {
				
				System.out.println("\nEnter the type of the item you want [1 - Book; 2 - Magazine; 3 - Scientific Article]: ");
				type = sc.next();
				
				if(type == "1") {
					do {
						
						 System.out.println("\nEnter the code of the book you want: ");
					     bookCod = (sc.next());
					     book = ItemController.searchBookByCode(bookCod);
					     
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
					     System.out.println("Do you want to add another book?");
					     option = sc.next();
					} while (option.toUpperCase().equals("S"));
				} 
				
				else if (type == "2") {
					do {
						System.out.println("\nEnter the code of the magazine you want: ");
					     magazineCod = (sc.next());
					     magazine = ItemController.searchMagazineByCode(magazineCod);
					     
					     if(magazine != null) {
					    	 borrowedMagazine = new BorrowedMagazine();
					    	 borrowedMagazine.setMagazine(magazine);
					    	 magazines.add(borrowedMagazine);
					    	 borrowedMagazine.getMagazine().setStatus("UNAVAILABLE");
					    	 System.out.println("Magazine successfully added");
					     }else {
					    	 System.out.println("Magazine not found");
					     }
					     
					     borrowing.setBorrowedMagazine(magazines);
					     System.out.println("Do you want to add another magazine?");
					     option = sc.next();
					} while (option.toUpperCase().equals("S"));
				}
				
				else if (type == "3") {
					do {
						System.out.println("\nEnter the code of the Scientific Article you want: ");
					     scienticAticleCod = (sc.next());
					     scientificArticle = ItemController.searchScientificArticleByCode(scienticAticleCod);
					     
					     if(scientificArticle != null) {
					    	 borrowedScientificArticle = new BorrowedScientificArticle();
					    	 borrowedScientificArticle.setScientificArticle(scientificArticle);
					    	 scientificArticles.add(borrowedScientificArticle);
					    	 borrowedScientificArticle.getScientificArticle().setStatus("UNAVAILABLE");
					    	 System.out.println("Scientific Article successfully added");
					     }else {
					    	 System.out.println("Scientific Article not found");
					     }
					     
					     borrowing.setBorrowedScientificArticle(scientificArticles);
					     System.out.println("Do you want to add another scientific article?");
					     option = sc.next();
					} while (option.toUpperCase().equals("S"));
				} 
				
			     System.out.println("Do you want to add another item?");
			     option = sc.next();
			} while (option.toUpperCase().equals("S"));
			BorrowingController.register(borrowing);
			System.out.println("\nBorrowing successfully registered");
		} else {
			System.out.println("Student not found");
		}
		System.out.println(borrowing.toString());
	}	
}
