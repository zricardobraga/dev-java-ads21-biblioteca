package views;

import controllers.ItemController;
import models.Magazine;

public class MagazineList {

	public static void render() {
		System.out.println("\n -- MAGAZINES --\n");
		
		for(Magazine registeredMagazine: ItemController.showMagazines()) {
			System.out.println(registeredMagazine);
		}
	}
}