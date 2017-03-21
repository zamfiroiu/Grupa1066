package factorymethod;

public class Camerista extends Angajat {

	public Camerista(String nume, int varsta) {
		super(nume, varsta);
	}

	@Override
	public String toString() {
		return "Camerista "+super.toString();
	}

}
