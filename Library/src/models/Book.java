package models;

public class Book {
	private int cod;
	private String tittle;
	private String status;
	private static int cont = 001;
	
	//contructo que gera o código do livro automáticamente
	public Book () {
		this.cod = Book.cont++;
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
}
