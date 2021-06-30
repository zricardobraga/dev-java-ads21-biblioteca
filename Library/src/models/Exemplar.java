package models;

public class Exemplar {
    
    private String cod;
	private String title;
    private String edition;
	private String status;
    private String type;

    public Exemplar () {
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

    public String getType() {
		return type;
	}
    
	public void setType(String type) {
		this.type = type;
	}
    
    @Override
	public String toString() {
		return "\nCod: " + getCod() + " | Tittle: " + getTitle() + " | Edition: " + getEdition() + " | Status: " + getStatus() + " | Type: " + getType();
	}
}
