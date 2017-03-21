package simplefactory;

public class CameraSingle implements Camera {

	private double pret;
	
	public CameraSingle(double pret) {
		this.pret=pret;
	}
	@Override
	public String getDescriere() {
		return "Aceasta este o camera single";
	}

	@Override
	public double getPret() {
		return this.pret;
	}

}
