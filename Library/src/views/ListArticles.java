package views;

import controllers.ExemplarController;
import models.Artigo;

public class ListArticles {
	
	public static void Render() {
		System.out.println("\n -- SCIENTIFIC ARTICLES --\n");
		
		for(Artigo registeredArticle: ExemplarController.showArticles()) {
			System.out.println(registeredArticle);
		}
	}

}
