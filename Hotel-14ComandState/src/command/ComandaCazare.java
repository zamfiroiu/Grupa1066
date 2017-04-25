package command;

public class ComandaCazare implements Comanda {

	private PachetTuristic pachet;	
	
	public ComandaCazare(PachetTuristic pachet) {
		super();
		this.pachet = pachet;
	}

	@Override
	public void executa() {
		pachet.cazeaza();
	}

}
