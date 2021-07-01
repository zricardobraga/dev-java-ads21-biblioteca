package views;

import controllers.ItemController;
import models.Magazine;

public class MagazineList {

	public static void Render() {
		System.out.println("\n -- MAGAZINES --\n");
		
		for(Magazine registeredMagazine: ItemController.showMagazines()) {
			System.out.println(registeredMagazine);
		}
	}
}