package views;

import java.util.Scanner;

import controllers.ExemplarController;
import models.ScientificArticle;

public class ArticleDelete {
	private static Scanner sc = new Scanner(System.in);

    public static void render() {

        System.out.println("\n" .repeat(15));
        System.out.println("\n-- DELETE SCIENTIFIC ARTICLE --\n");
        System.out.println("\nEnter the Article Code: ");
        String cod = (sc.nextLine());

        ScientificArticle registeredArticle = ExemplarController.searchScientificArticleByCode(cod);

        if(registeredArticle == null) {
            System.out.println("Scientific Article not found");
        }

        ExemplarController.deleteScientificArticle(cod, registeredArticle);
        System.out.println("Scientific Article successfully deleted!");
    }
}
