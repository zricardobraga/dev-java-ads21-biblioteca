package views;

import controllers.ExemplarController;
import models.Revista;

public class ListMagazines {
	
	public static void render() {
		System.out.println("\n -- MAGAZINES --\n");
		
		for(Revista registeredMagazine: ExemplarController.showMagazines()) {
			System.out.println(registeredMagazine);
		}
	}

}
