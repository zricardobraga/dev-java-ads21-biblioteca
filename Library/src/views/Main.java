package views;

import models.Book;
import models.Borrowing;
import models.Student;

public class Main {
	
	public static void main(String[] args) {
		
		Book book1 = new Book();
		System.out.println(book1.getCod());

		book1.setTittle("X");
		
		System.out.println(book1.toString());
		
//		Book book2 = new Book(); 
//		System.out.println(book2.getCod());
//		
//		Borrowing borrow = new Borrowing();
//		
//		System.out.println(borrow.getBorrowDate());
//		System.out.println(borrow.getReturnDate());
//		
//		Student student = new Student();
//		student.setName("Joe Doe");
//		student.setCpf("123.456.789-10");
//		student.setAddress("Rua Y, n 10, Bairro, Cidade/PR");
//		
//		System.out.println(student.toString());
		
//		StudentRegister.render();
		
	}

}
