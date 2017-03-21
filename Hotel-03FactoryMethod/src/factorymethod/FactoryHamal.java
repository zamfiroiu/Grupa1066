package factorymethod;

public class FactoryHamal extends FactoryAngajat {

	@Override
	public Angajat getAngajat(String nume, int varsta) {
		return new Hamal(nume, varsta);
	}
}
