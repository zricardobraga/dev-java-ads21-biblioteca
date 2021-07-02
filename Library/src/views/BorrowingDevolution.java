package views;

import java.util.Scanner;

import controllers.BorrowingController;
import models.BorrowedBook;
import models.BorrowedMagazine;
import models.BorrowedScientificArticle;
import models.Borrowing;

public class BorrowingDevolution {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void render() {

       System.out.println("\n" .repeat(15));
       System.out.println("\n-- DEVOLUTION --\n");
       System.out.println("\nEnter Borrowing's ID: ");
       int id = (sc.nextInt());

       Borrowing borrowing = BorrowingController.searchBorrowingById(id);

       if(borrowing == null)
       {
           System.out.println("Borrowing not found");
       }
        else {
            
            if(borrowing.getBorrowedBook() == null){ }
            else{
                for(BorrowedBook currentBook: borrowing.getBorrowedBook())
                {
                    currentBook.getBook().setStatus("AVAILABLE");
                }
            }

            if(borrowing.getBorrowedMagazine() == null){ } 
            else{
                for(BorrowedMagazine currentMagazine: borrowing.getBorrowedMagazine())
                {
                    currentMagazine.getMagazine().setStatus("AVAILABLE");
                }
            }

            if(borrowing.getBorrowedScientificArticle() == null){ }
            else{
                for(BorrowedScientificArticle currentArticle: borrowing.getBorrowedScientificArticle())
                {
                    currentArticle.getScientificArticle().setStatus("AVAILABLE");
                }
            }
            
            BorrowingController.delete(borrowing.getId(), borrowing);

            System.out.println("Success!");
       } 
    }       
}