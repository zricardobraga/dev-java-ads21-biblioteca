package views;

import java.util.Scanner;

import controllers.ItemController;
import models.ScientificArticle;

public class ScientificArticleDelete {
	private static Scanner sc = new Scanner(System.in);

    public static void render() {

        System.out.println("\n" .repeat(15));
        System.out.println("\n-- DELETE SCIENTIFIC ARTICLE --\n");
        System.out.println("\nEnter the Article Code: ");
        String cod = (sc.nextLine());

        ScientificArticle registeredArticle = ItemController.searchScientificArticleByCode(cod);

        if(registeredArticle == null) {
            System.out.println("Scientific Article not found");
        }

        ItemController.deleteScientificArticle(cod, registeredArticle);
        System.out.println("Scientific Article successfully deleted!");
    }
}
