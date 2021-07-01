package views;

import controllers.ItemController;
import models.ScientificArticle;

public class ArticleList {

	public static void Render() {
		System.out.println("\n -- SCIENTIFIC ARTICLES --\n");
		
		for(ScientificArticle registeredArticle: ItemController.showScientificArticles()) {
			System.out.println(registeredArticle);
		}
	}
}