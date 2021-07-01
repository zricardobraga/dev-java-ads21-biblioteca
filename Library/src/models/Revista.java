package models;

public class Revista extends Exemplar {
	
	private String editora;
	private String publicacao;
	
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getPublicacao() {
		return publicacao;
	}
	public void setPublicacao(String publicacao) {
		this.publicacao = publicacao;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "Revista \nEditora: " + getEditora() + "\nPublicacao: " + getPublicacao();
	}
	
	
	
	

}
