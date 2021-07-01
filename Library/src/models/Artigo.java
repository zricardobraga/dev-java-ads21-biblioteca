package models;

public class Artigo extends Exemplar {
	
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return super.toString() + "Artigo \nAutor: " + getAutor();
	}
	
	

}
