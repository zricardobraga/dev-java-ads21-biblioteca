package models;

import java.util.Date;

public class Book {
	private int cod;
	private String tittle;
	private String status;
	private static int cont = 001;
	private Date criadoEm;
	
	public Book () {
		setCriadoEm(new Date());
		//contructo que gera o código do livro automáticamente
		this.cod = Book.cont++;
		setStatus("AVAILABLE"); 
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
	
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return "\nCod: " + getCod() + " | Tittle: " + getTittle() + " | Status: " + getStatus();
	}
}
