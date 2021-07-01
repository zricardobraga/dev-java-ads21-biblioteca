package views;

import java.util.Scanner;

import controllers.ExemplarController;
import models.Artigo;

public class FindArticlesByCod {
	
	private static Scanner sc = new Scanner(System.in);
	private static Artigo artigo;
	private static String cod;
	
	public static void render() {
		artigo = new Artigo();
		System.out.println("\n".repeat(15));
		System.out.println("\n-- SEARCH SCIENTIFIC ARTICLE BY CODE --\n");
		System.out.println("\nEnter Scientific Article's Code: ");
		cod = sc.nextLine();
		artigo = ExemplarController.searchArticleByCode(cod);
		if(artigo != null) {
			System.out.println(artigo);
		}else {
			System.out.println("Scientific Article not found");
		}
	}

}
