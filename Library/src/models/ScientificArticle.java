package models;

public class ScientificArticle extends Item{
    
    private String theme;

	public ScientificArticle(){
		setType("3");
	}
	
    public String getTheme() {
		return theme;
	}
    
	public void setTheme(String theme) {
		this.theme = theme;
	}
    
    @Override
	public String toString() {
		return "\nTheme: " + getTheme();
	}
}