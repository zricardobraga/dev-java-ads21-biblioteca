package models;

public abstract class Item {
    
    private String cod;
	private String title;
	private String author;
    private String edition;
	private String status;
    private int type;

    public Item(){
		setStatus("AVAILABLE"); 
	}

    public String getCod() {
		return cod;
	}
	
	public void setCod(String cod) {
		this.cod = cod;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
    public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	

    public int getType() {
		return type;
	}
    
	public void setType(int type) {
		this.type = type;
	}
   
	public String toString() {
		return "\nCod: " + getCod() + "\nTittle: " + getTitle() + "\nAuthor: " + getAuthor() + "\nEdition: " + getEdition() + "\nStatus: " + getStatus() + "\nType: " + getType();
	}
}
