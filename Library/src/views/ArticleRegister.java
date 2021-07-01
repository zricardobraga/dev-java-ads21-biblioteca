package views;

import java.util.Scanner;

import controllers.ExemplarController;
import models.Artigo;

public class ArticleRegister {
	
	private static Artigo artigo;
	private static Scanner sc = new Scanner(System.in);
	
	public static void render() {
		artigo = new Artigo();
		System.out.println("\n".repeat(15));
		System.out.println("\n-- REGISTER SCIENTIFIC ARTICLE --  \n");				
		System.out.println("Enter the article Code: ");
		artigo.setCod(sc.nextLine());
		System.out.println("Enter the article Title: ");
		artigo.setTitulo(sc.nextLine());
		System.out.println("Enter the article Edition: ");
		artigo.setEdicao(sc.nextLine());
		System.out.println("Enter the article Author: ");
		artigo.setAutor(sc.nextLine());
		
		if(ExemplarController.registerArticle(artigo)) {
			System.out.println("Scientific Article successfully registered!");
		}else {
			System.out.println();
		}
	}

}
