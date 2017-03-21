package factorymethod;

public class FactoryReceptioner extends FactoryAngajat {

	@Override
	public Angajat getAngajat(String nume, int varsta) {
		return new Receptioner(nume, varsta);
	}
}
