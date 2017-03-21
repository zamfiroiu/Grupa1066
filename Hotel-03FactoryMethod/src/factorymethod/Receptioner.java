package factorymethod;

public class Receptioner extends Angajat {

	protected Receptioner(String nume, int varsta) {
		super(nume, varsta);
	}

	@Override
	public String toString() {
		return "Receptioner "+ super.toString();
	}

}
