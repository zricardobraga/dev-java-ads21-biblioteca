package views;

import java.util.Scanner;

import controllers.ExemplarController;
import models.Revista;

public class EditMagazine {
	
	private static Scanner sc = new Scanner(System.in);

    public static void render() {

        System.out.println("\n" .repeat(15));
        System.out.println("\n-- EDIT MAGAZINE --\n");
        System.out.println("\nEnter the magazine's code to edit: ");
        String cod = (sc.nextLine());

        if(cod == null) {
            System.out.println("Magazine not found");
        } else {
        	Revista revistaAtual = ExemplarController.searchMagazineByCode(cod);
            Revista revistaAtualizada = new Revista();
            
            System.out.println("\nEnter the new Code: ");
            revistaAtualizada.setCod(sc.nextLine());
            System.out.println("\nEnter the new Title: ");
            revistaAtualizada.setTitulo(sc.nextLine());
            System.out.println("\nEnter the new Publisher: ");
            revistaAtualizada.setEditora(sc.nextLine());
            System.out.println("\nEnter the new Edition: ");
            revistaAtualizada.setEdicao(sc.nextLine());
            System.out.println("\nEnter the new Publication: ");
            revistaAtualizada.setPublicacao(sc.nextLine());

            
            ExemplarController.editMagazine(cod, revistaAtual, revistaAtualizada);

            System.out.println("\nMagazine successfully edited!");
        }        
    }

}
