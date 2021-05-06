package controllers;
import models.BorrowedBook;
import models.Book;

public class BorrowedBookController {
	
	public static Boolean findBorrowedBook(BorrowedBook borrow)
	{
		Book bookFound = BookController.findBookByCode(borrow.getBook().getCod());
		
		if(bookFound == null)
		{
			System.out.print("Livro não existe");
			return false;
		}
		
		return true;
	}
	
	public static void changeBookStatus(BorrowedBook borrow)
	{
		Book bookFound = BookController.findBookByCode(borrow.getBook().getCod());
		
		bookFound.setStatus("UNAVAILABLE");
	}
}
