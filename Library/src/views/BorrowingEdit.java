package views;

import java.util.Scanner;

import controllers.ItemController;
import controllers.BorrowingController;
import models.Book;
import models.Borrowing;

public class BorrowingEdit {
	
//	private static Scanner sc = new Scanner(System.in);
//	
//	public static void render() {
//
//        System.out.println("\n" .repeat(15));
//        System.out.println("\n-- EDIT BORROWING --\n");
//        System.out.println("\nEnter stundent CPF: ");
//        String cpf = (sc.nextLine());
//
//        if(cpf == null) {
//            System.out.println("Borrowing not found");
//        } else {
//        	Borrowing oldBorrowing = BorrowingController.listStudentBorrowings(cpf);
//            Book newBook = new Book();
//            
//            System.out.println("\nDigite o novo código: ");
//            System.out.println("\nDigite o novo título: ");
//            newBook.setTittle(sc.nextLine());
//            System.out.println("\nDigite o novo Autor: ");
//            newBook.setAuthor(sc.nextLine());
//            
//            BookController.edit(cpf, oldBook, newBook);
//
//            System.out.println("\nLivro editado!");
//        }        
//    }
}
