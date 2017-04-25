package state;

import command.PachetTuristic;

public class Cazat implements Stare {

	@Override
	public void rezerva(PachetTuristic pachet) {
		System.out.println("Nu se poate. Clientul este deja cazat.");

	}

	@Override
	public void cumpara(PachetTuristic pachet) {
		System.out.println("Nu se poate. Clientul este deja cazat.");

	}

	@Override
	public void cazeaza(PachetTuristic pachet) {
		System.out.println("Nu se poate. Clientul este deja cazat.");

	}

}
