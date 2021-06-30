package models;

public class Magazine extends Exemplar{
    
    private String publisher;
    private String publication;

	public Magazine(){
		setType("2");
	}

    public String getPublisher() {
		return publisher;
	}
    
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

    public String getPublication() {
		return publication;
	}
    
	public void setPublication(String publication) {
		this.publication = publication;
	}
    
    @Override
	public String toString() {
		return "\nPublisher: " + getPublisher() + " | Publication: " + getPublication();
	}
}