package views;

import java.util.Scanner;

import models.Console;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		do {
			System.out.println("\nLIBRARY\n");
			System.out.println("1 - Book Register");
			System.out.println("2 - List Books");
			System.out.println("3 - Find Book by Code");
			System.out.println("4 - Book Edit");
			System.out.println("5 - Book Delete");
			System.out.println("6 - Magazine Register");
			System.out.println("7 - List Magazines");
			System.out.println("8 - Find Magazine by Code");
			System.out.println("9 - Magazine Edit");
			System.out.println("10 - Magazine Delete");
			System.out.println("11 - Article Register");
			System.out.println("12 - List Articles");
			System.out.println("13 - Find Article by Code");
			System.out.println("14 - Article Edit");
			System.out.println("15 - Article Delete");
			System.out.println("16 - Student Register");
			System.out.println("17 - List Student");
			System.out.println("18 - Find Student by Cpf");
			System.out.println("19 - Student Edit");
			System.out.println("20 - Student Delete");
			System.out.println("21 - Borrowing Register");
			System.out.println("22 - Borrowing List");
			System.out.println("23 - List Borrowing By Student");
			System.out.println("24 - Borrowing Edit");
			System.out.println("25 - Borrowing Delete");
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
					MagazineRegister.render();
					break;	
				case 7:
					ListMagazines.render();					
					break;
				case 8:
					FindMagazinesByCod.render();
					break;
				case 9:
					//EditMagazine.render();
					break;
				case 10:
					//MagazineDelete.render();
					break;
				case 11:
					//ArticleRegister.render();
					break;	
				case 12:
					//ListArticles.Render();					
					break;
				case 13:
					//FindArticlesByCod.render();
					break;
				case 14:
					//EditArticle.render();
					break;
				case 15:
					//ArticleDelete.render();
					break;	
				case 16:
					StudentRegister.render();
					break;
				case 17:
					ListStudent.render();
					break;	
				case 18:
					FindStudentByCpf.render();
					break;
				case 19:
					StudentEdit.render();
					break;
				case 20:
					StudentDelete.render();
					break;				
				case 21:
					BorrowingRegister.render();
					break;
				case 22:
					ListBorrowing.render();
					break;
				case 23:
					ListBorrowingsByStudent.render();
					break;
				case 24:
//					BorrowingEdit.render();
					break;
				case 25:
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

