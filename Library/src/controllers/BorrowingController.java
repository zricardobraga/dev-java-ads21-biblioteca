package controllers;
import java.util.ArrayList;
import models.Borrowing;
import models.BorrowedBook;
import models.Student;

public class BorrowingController {

	private static ArrayList<Borrowing> borrows = new ArrayList<Borrowing>();
	
	public static ArrayList<Borrowing> list() {
		return borrows;
	}
	
	public static Boolean register(Borrowing borrowing) {
		
		Student studentFound = StudentController.searchByCpf(borrowing.getStudent().getCpf());
		
		if(studentFound == null)
		{
			System.out.println("Estudante não cadastrado");
			return false;
		}
		
		for(BorrowedBook bookBorrowed : borrowing.getBorrowedBook())
		{
			Boolean bookFound = BorrowedBookController.findBorrowedBook(bookBorrowed);
			
			if(bookFound == false)
			{
				System.out.print("Livro não existe");
				return false;
			}
				
			BorrowedBookController.changeBookStatus(bookBorrowed);
			continue;
		}
			
		borrows.add(borrowing);
		return true;
	}
}
