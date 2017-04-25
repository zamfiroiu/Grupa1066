package memento;

public class Hotel {

	private static Hotel instanta = null;
	private String nume;
	private int nrCamere;
	private int nrCamereOcupate;
	
	private Hotel(String nume, int nrCamere, int nrCamereOcupate) {
		super();
		this.nume = nume;
		this.nrCamere = nrCamere;
		this.nrCamereOcupate = nrCamereOcupate;
	}
	
	public static Hotel getInstanta(String nume, int nrCamere, int nrCamereOcupate){
		if(instanta==null){
			instanta=new Hotel(nume, nrCamere, nrCamereOcupate);
		}
		return instanta;
	}
	
	public void rezervaCamere(int nrCamere){
		this.nrCamereOcupate+=nrCamere;
	}

	@Override
	public String toString() {
		return "Hotel [nume=" + nume + ", nrCamere=" + nrCamere + ", nrCamereOcupate=" + nrCamereOcupate + "]";
	}
	
	public Memento salveazaMemento(){
		return new Memento(this.nrCamereOcupate);
	}
	
	public void restaureaza(Memento memento){
		this.nrCamereOcupate=memento.getNrCamereOcupate();
	}
	
}
