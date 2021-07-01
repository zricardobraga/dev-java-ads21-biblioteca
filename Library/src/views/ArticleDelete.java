package views;

import java.util.Scanner;

import controllers.ExemplarController;
import models.Artigo;

public class ArticleDelete {
	
	private static Scanner sc = new Scanner(System.in);

    public static void render() {

        System.out.println("\n" .repeat(15));
        System.out.println("\n-- DELETE SCIENTIFIC ARTICLE --\n");
        System.out.println("\nEnter the Article Code: ");
        String cod = (sc.nextLine());

        Artigo registeredArticle = ExemplarController.searchArticleByCode(cod);

        if(registeredArticle == null) {
            System.out.println("Scientific Article not found");
        }

        ExemplarController.deleteArticle(cod, registeredArticle);
        System.out.println("Scientific Article successfully deleted!");
    }

}
