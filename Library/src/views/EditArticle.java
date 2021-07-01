package views;

import java.util.Scanner;

import controllers.ExemplarController;
import models.Artigo;

public class EditArticle {
	
	private static Scanner sc = new Scanner(System.in);

    public static void render() {

        System.out.println("\n" .repeat(15));
        System.out.println("\n-- EDIT SCIENTIFIC ARTICLE --\n");
        System.out.println("\nEnter the Article's code to edit: ");
        String cod = (sc.nextLine());

        if(cod == null) {
            System.out.println("Scientific Article not found");
        } else {
        	Artigo artigoAtual = ExemplarController.searchArticleByCode(cod);
            Artigo artigoAtualizado = new Artigo();
            
            System.out.println("\nEnter the new Code: ");
            artigoAtualizado.setCod(sc.nextLine());
            System.out.println("\nEnter the new Title: ");
            artigoAtualizado.setTitulo(sc.nextLine());
            System.out.println("\nEnter the new Author: ");
            artigoAtualizado.setAutor(sc.nextLine());
            System.out.println("\nEnter the new Edition: ");
            artigoAtualizado.setEdicao(sc.nextLine());
            
            ExemplarController.editArticle(cod, artigoAtual, artigoAtualizado);

            System.out.println("\nScientific Article successfully edited!");
        }        
    }

}
