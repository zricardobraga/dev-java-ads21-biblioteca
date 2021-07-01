package views;

import java.util.Scanner;

import controllers.ItemController;
import models.Magazine;

public class MagazineFindByCode {
	private static Scanner sc = new Scanner(System.in);
	private static Magazine magazine;
	private static String cod;
	
	public static void render() {
		magazine = new Magazine();
		System.out.println("\n".repeat(15));
		System.out.println("\n-- SEARCH MAGAZINE BY CODE --\n");
		System.out.println("\nEnter Magazine Code: ");
		cod = sc.nextLine();
		magazine = ItemController.searchMagazineByCode(cod);
		if(magazine != null) {
			System.out.println(magazine);
		}else {
			System.out.println("Magazine not found");
		}
	}
}
