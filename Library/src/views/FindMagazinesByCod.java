package views;

import java.util.Scanner;

import controllers.ExemplarController;
import models.Revista;

public class FindMagazinesByCod {
	
	private static Scanner sc = new Scanner(System.in);
	private static Revista revista;
	private static String cod;
	
	public static void render() {
		revista = new Revista();
		System.out.println("\n".repeat(15));
		System.out.println("\n-- SEARCH MAGAZINE BY CODE --\n");
		System.out.println("\nEnter Magazine Code: ");
		cod = sc.nextLine();
		revista = ExemplarController.searchMagazineByCode(cod);
		if(revista != null) {
			System.out.println(revista);
		}else {
			System.out.println("Magazine not found");
		}
	}

}
