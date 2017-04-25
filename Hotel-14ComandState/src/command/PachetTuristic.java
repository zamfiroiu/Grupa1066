package command;

import state.Stare;

public class PachetTuristic {
	private Stare stareCurenta;
	
	public void setStareCurenta(Stare stareCurenta) {
		this.stareCurenta = stareCurenta;
	}
	
	public PachetTuristic(Stare stareCurenta) {
		super();
		this.stareCurenta = stareCurenta;
	}
	public void rezerva(){
		stareCurenta.rezerva(this);
	}
	public void cumpara(){
		stareCurenta.cumpara(this);
	}
	public void cazeaza(){
		stareCurenta.cazeaza(this);
	}
}
