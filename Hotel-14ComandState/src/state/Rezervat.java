package state;

import command.PachetTuristic;

public class Rezervat implements Stare {

	@Override
	public void rezerva(PachetTuristic pachet) {
		System.out.println("Pachetul a fost deja rezervat.");

	}

	@Override
	public void cumpara(PachetTuristic pachet) {
		System.out.println("Pacgetul este cumparat");
		pachet.setStareCurenta(new Cumparat());
	}

	@Override
	public void cazeaza(PachetTuristic pachet) {
		System.out.println("Pachetul nu a fost inca achitat");

	}

}
