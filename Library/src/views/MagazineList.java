package views;

import controllers.ExemplarController;
import models.Magazine;

public class MagazineList {

	public static void Render() {
		System.out.println("\n -- MAGAZINES --\n");
		
		for(Magazine registeredMagazine: ExemplarController.showMagazines()) {
			System.out.println(registeredMagazine);
		}
	}
}