package views;

import controllers.ExemplarController;
import models.ScientificArticle;

public class ArticleList {

	public static void Render() {
		System.out.println("\n -- SCIENTIFIC ARTICLES --\n");
		
		for(ScientificArticle registeredArticle: ExemplarController.showScientificArticles()) {
			System.out.println(registeredArticle);
		}
	}
}