package simplefactory;

public class Apartament implements Camera {

	private double pret;
	
	public Apartament(double pret) {
		this.pret=pret;
	}
	@Override
	public String getDescriere() {
		return "Acesta este un apartament";
	}

	@Override
	public double getPret() {
		return pret;
	}

}
