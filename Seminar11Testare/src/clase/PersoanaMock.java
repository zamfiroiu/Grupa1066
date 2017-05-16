package clase;

public class PersoanaMock implements IPersoana {

	@Override
	public void setCNP(String cNP) {	

	}

	@Override
	public String getSex() throws Exception {
		
		return "M";
	}

	@Override
	public int getVarsta() {
		return 19;
	}

}
