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
			System.out.println("7 - Borrowing Register");
			System.out.println("8 - Borrowing Controller");
			System.out.println("0 - Exit");
			
			System.out.print("\nDigite uma opção:");
			opcao = sc.nextInt();
			
			switch(opcao) {
				case 1:
					BookRegister.render();
					break;	
				case 2:
					ListBooks.Render();					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					StudentRegister.render();
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

