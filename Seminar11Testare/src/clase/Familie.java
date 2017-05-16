package clase;

public class Familie {
	
	private IPersoana sot;
	private IPersoana sotie;
	
	public Familie(IPersoana sot, IPersoana sotie) {
		this.sot=sot;
		this.sotie=sotie;
	}
	
	public boolean checkFamilie() {
		if(sot.getVarsta()<18 || sotie.getVarsta()<18)
			return false;
		return true;		
	}

}