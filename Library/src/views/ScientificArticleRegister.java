package views;
import java.util.Scanner;
import controllers.ItemController;
import models.ScientificArticle;

public class ScientificArticleRegister {
	
	private static ScientificArticle article;
	private static Scanner sc = new Scanner(System.in);
	
	public static void render() {
		article = new ScientificArticle();
		System.out.println("\n".repeat(10));
		System.out.println("\n-- REGISTER SCIENTIFIC ARTICLE --  \n");				
		System.out.println("Enter the article Code: ");
		article.setCod(sc.nextLine());
		System.out.println("Enter the article Title: ");
		article.setTitle(sc.nextLine());
		System.out.println("Enter the article Edition: ");
		article.setEdition(sc.nextLine());
		System.out.println("Enter the article Author: ");
		article.setAuthor(sc.nextLine());
		
		if(ItemController.registerScientificArticle(article)) {
			System.out.println("Scientific Article successfully registered!");
		}else {
			System.out.println();
		}
	}
}