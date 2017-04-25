package program;

import command.Comanda;
import command.ComandaCazare;
import command.ComandaCumpara;
import command.Operator;
import command.PachetTuristic;
import state.Rezervat;

public class Program {

	public static void main(String[] args) {
		Operator operator=new Operator();
		
		PachetTuristic pachet=new PachetTuristic(new Rezervat());
		
		Comanda comandaCumparare=new ComandaCumpara(pachet);
		Comanda comandaCazare=new ComandaCazare(pachet);
		
		operator.invoca(comandaCazare);
		operator.invoca(comandaCumparare);
		operator.invoca(comandaCazare);

		operator.invoca(comandaCazare);
		

	}

}
