package controllers;
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
	
	public static Borrowing searchBorrowingById(int id) {
		for(Borrowing registeredBorrow: borrowings) {
			if(registeredBorrow.getId().equals(id)) {
				return registeredBorrow;
			}
		}
		return null;
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
	
	public static boolean delete(int id, Borrowing borrow)
	{
		for(Borrowing registeredBorrow: borrowings){
			if(registeredBorrow.getId() == id){
				borrowings.remove(borrow);
				return true;
			}
		}

		return false;
	}
}	
