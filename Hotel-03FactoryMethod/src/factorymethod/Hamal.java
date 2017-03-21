package factorymethod;

public class Hamal extends Angajat {

	public Hamal(String nume, int varsta) {
		super(nume, varsta);
	}

	@Override
	public String toString() {
		return "Hamal "+super.toString();
	}
	

}
