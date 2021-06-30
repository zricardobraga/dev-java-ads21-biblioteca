package views;

import java.util.Scanner;

import controllers.ExemplarController;
import models.Magazine;

public class MagazineEdit {
	
	private static Scanner sc = new Scanner(System.in);

    public static void render() {

        System.out.println("\n" .repeat(15));
        System.out.println("\n-- EDIT MAGAZINE --\n");
        System.out.println("\nEnter the magazine's code to edit: ");
        String cod = (sc.nextLine());

        if(cod == null) {
            System.out.println("Magazine not found");
        } else {
        	Magazine oldMagazine = ExemplarController.searchMagazineByCode(cod);
            Magazine newMagazine = new Magazine();
            
            System.out.println("\nEnter the new Code: ");
            newMagazine.setCod(sc.nextLine());
            System.out.println("\nEnter the new Title: ");
            newMagazine.setTitle(sc.nextLine());
            System.out.println("\nEnter the new Publisher: ");
            newMagazine.setPublisher(sc.nextLine());
            System.out.println("\nEnter the new Edition: ");
            newMagazine.setEdition(sc.nextLine());
            System.out.println("\nEnter the new Publication: ");
            newMagazine.setPublication(sc.nextLine());

            
            ExemplarController.editMagazine(cod, oldMagazine, newMagazine);

            System.out.println("\nMagazine successfully edited!");
        }        
    }
}
