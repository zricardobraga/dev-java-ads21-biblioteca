package views;

import java.util.Scanner;

import controllers.ExemplarController;
import models.ScientificArticle;

public class ArticleFindByCode {
	private static Scanner sc = new Scanner(System.in);
	private static ScientificArticle article;
	private static String cod;
	
	public static void render() {
		article = new ScientificArticle();
		System.out.println("\n".repeat(15));
		System.out.println("\n-- SEARCH SCIENTIFIC ARTICLE BY CODE --\n");
		System.out.println("\nEnter Scientific Article's Code: ");
		cod = sc.nextLine();
		article = ExemplarController.searchScientificArticleByCode(cod);
		if(article != null) {
			System.out.println(article);
		}else {
			System.out.println("Scientific Article not found");
		}
	}
}
