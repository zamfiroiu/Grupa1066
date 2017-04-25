package command;

public class ComandaCumpara implements Comanda {

	private PachetTuristic pachet;
	
	public ComandaCumpara(PachetTuristic pachet) {
		super();
		this.pachet = pachet;
	}

	@Override
	public void executa() {
		pachet.cumpara();
	}

}
