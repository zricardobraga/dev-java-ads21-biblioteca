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
			System.out.println("3 - Find Book by Code");
			System.out.println("4 - Book Edit");
			System.out.println("5 - Book Delete");
			System.out.println("6 - Magazine Register");
			System.out.println("7 - List Magazines");
			System.out.println("8 - Find Magazine by Code");
			System.out.println("9 - Magazine Edit");
			System.out.println("10 - Magazine Delete");
			System.out.println("11 - Scientific Article Register");
			System.out.println("12 - List Scientific Articles");
			System.out.println("13 - Find Scientific Article by Code");
			System.out.println("14 - Scientific Article Edit");
			System.out.println("15 - Scientific Article Delete");
			System.out.println("16 - Student Register");
			System.out.println("17 - List Student");
			System.out.println("18 - Find Student by Cpf");
			System.out.println("19 - Student Edit");
			System.out.println("20 - Student Delete");
			System.out.println("21 - Borrowing Register");
			System.out.println("22 - Borrowing List");
			System.out.println("23 - Borrowing Delete");
			System.out.println("24 - Borrowing Devolution");
			System.out.println("0 - Exit");
			
			System.out.print("\nDigite uma opcao:");
			opcao = sc.nextInt();
			
			switch(opcao) {
				case 1:
					BookRegister.render();
					break;	
				case 2:
					BookList.Render();					
					break;
				case 3:
					BookFindByCode.render();
					break;
				case 4:
					BookEdit.render();
					break;
				case 5:
					BookDelete.render();
					break;
				case 6:
					MagazineRegister.render();
					break;
				case 7:
					MagazineList.render();
					break;	
				case 8:
					MagazineFindByCode.render();
					break;
				case 9:
					MagazineEdit.render();
					break;
				case 10:
					MagazineDelete.render();
					break;				
				case 11:
					ScientificArticleRegister.render();
					break;
				case 12:
					ScientificArticleList.render();
					break;
				case 13:
					ScientificArticleFindByCode.render();
					break;
				case 14:
					ScientificArticleEdit.render();
					break;
				case 15:
					ScientificArticleDelete.render();
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
					BorrowingDelete.render();
					break;
				case 24:
//					BorrowingDevolution.render();
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

