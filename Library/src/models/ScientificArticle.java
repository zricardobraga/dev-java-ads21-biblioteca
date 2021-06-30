package models;

public class ScientificArticle extends Exemplar{
    
    private String author;

	public ScientificArticle(){
		setType("3");
	}
	
    public String getAuthor() {
		return author;
	}
    
	public void setAuthor(String author) {
		this.author = author;
	}
    
    @Override
	public String toString() {
		return "\nAuthor: " + getAuthor();
	}
}