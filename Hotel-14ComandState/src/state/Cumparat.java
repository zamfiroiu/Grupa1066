package state;

import command.PachetTuristic;

public class Cumparat implements Stare {

	@Override
	public void rezerva(PachetTuristic pachet) {
		System.out.println("Pachetul a fost deja cumparat.");

	}

	@Override
	public void cumpara(PachetTuristic pachet) {
		System.out.println("Pachetul a fost deja cumparat.");

	}

	@Override
	public void cazeaza(PachetTuristic pachet) {
		System.out.println("Clientul se cazeaza");
		pachet.setStareCurenta(new Cazat());

	}

}
