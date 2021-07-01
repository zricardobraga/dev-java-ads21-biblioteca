package views;
import java.util.Scanner;
import controllers.ItemController;
import models.Magazine;

public class MagazineRegister {
	
	private static Magazine magazine;
	private static Scanner sc = new Scanner(System.in);
	
	public static void render() {
		magazine = new Magazine();
		System.out.println("\n".repeat(10));
		System.out.println("\n-- REGISTER MAGAZINE --  \n");				
		System.out.println("Enter the magazine Code: ");
		magazine.setCod(sc.nextLine());
		System.out.println("Enter the magazine Title: ");
		magazine.setTitle(sc.nextLine());
		System.out.println("Enter the magazine Edition: ");
		magazine.setEdition(sc.nextLine());
		System.out.println("Enter the magazine Publisher: ");
		magazine.setPublisher(sc.nextLine());
		System.out.println("Enter the magazine Publication: ");
		magazine.setPublication(sc.nextLine());
		
		if(ItemController.registerMagazine(magazine)) {
			System.out.println("Magazine successfully registered!");
		}else {
			System.out.println();
		}
	}
}