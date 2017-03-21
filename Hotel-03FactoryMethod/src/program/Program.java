package program;

import factorymethod.Angajat;
import factorymethod.FactoryAngajat;
import factorymethod.FactoryCamerista;
import factorymethod.FactoryHamal;
import factorymethod.FactoryReceptioner;

public class Program {

	private static void afisareAngajat(FactoryAngajat fabricaAngajati) {
		Angajat angajat = fabricaAngajati.getAngajat("Popescu", 34);
		System.out.println(angajat.toString());		
	}
	
	public static void main(String[] args) {
		afisareAngajat(new FactoryReceptioner());
		

	}

}
