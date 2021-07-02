package views;

import controllers.ItemController;
import models.ScientificArticle;

public class ScientificArticleList {

	public static void render() {
		System.out.println("\n -- SCIENTIFIC ARTICLES --\n");
		
		for(ScientificArticle registeredArticle: ItemController.showScientificArticles()) {
			System.out.println(registeredArticle);
		}
	}
}