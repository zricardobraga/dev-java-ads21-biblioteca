package views;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		do {
			System.out.println("\nLIBRARY\n");
			System.out.println("\n1 - Book Register");
			System.out.println("2 - Student Register");
			System.out.println("3 - Borrowing Register");
			System.out.println("4 - Borrowing Controller");
			System.out.println("0 - Exit");
			
			System.out.print("\nDigite uma opção:");
			opcao = sc.nextInt();
			
			switch(opcao) {
				case 1:
					BookRegister.render();
					break;	
				case 2:
					StudentRegister.render();					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 0:
					System.out.println("Exit..");
					break;
				default:
				}
	} while(opcao != 0);
	
	sc.close();		
}
			
		
//		Book book1 = new Book();
//		System.out.println(book1.getCod());
//		
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

