package models;

public class BorrowedScientificArticle {
	
	private ScientificArticle scientificArticle;

	public ScientificArticle getScientificArticle() {
		return scientificArticle;
	}

	public void setScientificArticle(ScientificArticle scientificArticle) {
		this.scientificArticle = scientificArticle;
	}

	@Override
	public String toString() {
		return "Borrowed ScientificArticle: " + scientificArticle;
	}
	
}
