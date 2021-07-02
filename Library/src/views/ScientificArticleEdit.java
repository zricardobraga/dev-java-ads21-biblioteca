package views;

import java.util.Scanner;

import controllers.ItemController;
import models.ScientificArticle;

public class ScientificArticleEdit {
	
	private static Scanner sc = new Scanner(System.in);

    public static void render() {

        System.out.println("\n" .repeat(15));
        System.out.println("\n-- EDIT SCIENTIFIC ARTICLE --\n");
        System.out.println("\nEnter the Article's code to edit: ");
        String cod = (sc.nextLine());

        if(cod == null) {
            System.out.println("Scientific Article not found");
        } else {
        	ScientificArticle oldArticle = ItemController.searchScientificArticleByCode(cod);
            ScientificArticle newArticle = new ScientificArticle();
            
            System.out.println("\nEnter the new Code: ");
            newArticle.setCod(sc.nextLine());
            System.out.println("\nEnter the new Title: ");
            newArticle.setTitle(sc.nextLine());
            System.out.println("\nEnter the new Author: ");
            newArticle.setAuthor(sc.nextLine());
            System.out.println("\nEnter the new Edition: ");
            newArticle.setEdition(sc.nextLine());
            
            ItemController.editScientificArticle(cod, oldArticle, newArticle);

            System.out.println("\nScientific Article successfully edited!");
        }        
    }
}
