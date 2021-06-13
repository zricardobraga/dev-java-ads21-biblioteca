package views;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		do {
			System.out.println("\nLIBRARY\n");
			System.out.println("1 - Book Register");
			System.out.println("2 - List Books");
			System.out.println("3 - Find Book by Id");
			System.out.println("4 - Book Edit");
			System.out.println("5 - Book Delete");
			System.out.println("6 - Student Register");
			System.out.println("7 - List Student");
			System.out.println("8 - Find Student by Cpf");
			System.out.println("9 - Student Edit");
			System.out.println("10 - Student Delete");
			System.out.println("11 - Borrowing Register");
			System.out.println("12 - Borrowing List");
			System.out.println("13 - List Borrowing By Student");
			System.out.println("14 - Borrowing Edit");
			System.out.println("15 - Borrowing Delete");
			System.out.println("0 - Exit");
			
			System.out.print("\nDigite uma opcao:");
			opcao = sc.nextInt();
			
			switch(opcao) {
				case 1:
					BookRegister.render();
					break;	
				case 2:
					ListBooks.Render();					
					break;
				case 3:
					FindBooksByCod.render();
					break;
				case 4:
					EditBook.render();
					break;
				case 5:
					BookDelete.render();
					break;
				case 6:
					StudentRegister.render();
					break;
				case 7:
					ListStudent.render();
					break;	
				case 8:
					FindStudentByCpf.render();
					break;
				case 9:
					StudentEdit.render();
					break;
				case 10:
					StudentDelete.render();
					break;				
				case 11:
					BorrowingRegister.render();
					break;
				case 12:
					ListBorrowing.render();
					break;
				case 13:
					ListBorrowingsByStudent.render();
					break;
				case 14:
//					BorrowingEdit.render();
					break;
				case 15:
					BorrowingDelete.render();
					break;
				case 0:
					System.out.println("Exit..");
					break;
				default:
				}
	} while(opcao != 0);
	
	sc.close();		
	}		
}

