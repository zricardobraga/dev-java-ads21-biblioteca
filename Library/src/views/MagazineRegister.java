package views;

import java.util.Scanner;

import controllers.ExemplarController;
import models.Revista;

public class MagazineRegister {
	
	private static Revista revista;
	private static Scanner sc = new Scanner(System.in);
	
	public static void render() {
		revista = new Revista();
		System.out.println("\n".repeat(15));
		System.out.println("\n-- REGISTER MAGAZINE --  \n");				
		System.out.println("Enter the magazine Code: ");
		revista.setCod(sc.nextLine());
		System.out.println("Enter the magazine Title: ");
		revista.setTitulo(sc.nextLine());
		System.out.println("Enter the magazine Edition: ");
		revista.setEdicao(sc.nextLine());
		System.out.println("Enter the magazine Publisher: ");
		revista.setEditora(sc.nextLine());
		System.out.println("Enter the magazine Publication: ");
		revista.setPublicacao(sc.nextLine());
		
		if(ExemplarController.registerMagazine(revista)) {
			System.out.println("Magazine successfully registered!");
		}else {
			System.out.println();
		}
	}

}
