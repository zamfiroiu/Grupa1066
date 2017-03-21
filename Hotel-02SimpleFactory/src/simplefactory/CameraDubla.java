package simplefactory;

public class CameraDubla implements Camera {

	private double pret;
	
	public CameraDubla(double pret){
		this.pret=pret;
	}
	
	@Override
	public String getDescriere() {
		return "Aceasta camera este dubla";
	}

	@Override
	public double getPret() {
		return this.pret;
	}

}
