package factorymethod;

public class FactoryCamerista extends FactoryAngajat {

	@Override
	public Angajat getAngajat(String nume, int varsta) {
		return new Camerista(nume, varsta);
	}
}
