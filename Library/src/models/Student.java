package models;

public class Student {
	
	private String name;
	private String cpf;
	private String address;
	
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "\nName: " + getName() + " | Cpf: " + getCpf() + " | Address: " + getAddress();
	}

}
