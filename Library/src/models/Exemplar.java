package models;

public abstract class Exemplar {
	
	private String cod;
	private String titulo;
	private String edicao;
	private String status;
	private String tipo;
	
	public Exemplar () {
		setStatus("AVAILABLE"); 
	}
	
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Exemplar \nCod: " + getCod() + "\nTítulo: " + getTitulo() + "\nEdição: " + getEdicao() + "\nStatus: " + getStatus() + "\nTipo: "
				+ getTipo();
	}
	
	
	
	
}
