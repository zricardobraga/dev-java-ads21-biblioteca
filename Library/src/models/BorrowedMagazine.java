package models;

public class BorrowedMagazine {
	
	private Magazine magazine;

	public Magazine getMagazine() {
		return magazine;
	}

	public void setMagazine(Magazine magazine) {
		this.magazine = magazine;
	}

	@Override
	public String toString() {
		return "Borrowed Magazine: " + magazine;
	}

}
