package state;

import command.PachetTuristic;

public interface Stare {
	void rezerva(PachetTuristic pachet);
	void cumpara(PachetTuristic pachet);
	void cazeaza(PachetTuristic pachet);
}
