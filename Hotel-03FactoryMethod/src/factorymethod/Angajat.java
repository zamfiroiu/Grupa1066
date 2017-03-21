package factorymethod;

public abstract class Angajat {
	private String nume;
	private int varsta;
	
	protected Angajat(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}
	
	@Override
	public String toString() {
		return "Angajat [nume=" + nume + ", varsta=" + varsta + "]";
	}

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	

}
