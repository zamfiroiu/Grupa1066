package program;

import strategy.Client;
import strategy.VerificareAmericani;
import strategy.VerificareEuropeniUE;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("Gigel", new VerificareAmericani());
		client.verificareDocumente();
		client.setModVerificare(new VerificareEuropeniUE());
		client.verificareDocumente();
		
		//Cazan Andrei a raspuns corect

	}

}
