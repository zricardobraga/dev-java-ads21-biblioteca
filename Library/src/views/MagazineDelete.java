package views;

import java.util.Scanner;

import controllers.ItemController;
import models.Magazine;

public class MagazineDelete {
	private static Scanner sc = new Scanner(System.in);

    public static void render() {

        System.out.println("\n" .repeat(15));
        System.out.println("\n-- DELETE MAGAZINE --\n");
        System.out.println("\nEnter the magazine code: ");
        String cod = (sc.nextLine());

        Magazine registeredMagazine = ItemController.searchMagazineByCode(cod);

        if(registeredMagazine == null) {
            System.out.println("Magazine not found");
        }

        ItemController.deleteMagazine(cod, registeredMagazine);
        System.out.println("Magazine successfully deleted!");
    }
}