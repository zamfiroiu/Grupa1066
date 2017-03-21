package builder;

public class Camera {
	
	private int numar;
	private String tip;
	private boolean locParcare;
	private boolean vedere;
	private boolean micDejun;
	private boolean balcon;


	public Camera() {
		super();
		this.numar = 10;
		this.tip = "Single";
		this.locParcare = false;
		this.vedere = false;
		this.micDejun = false;
		this.balcon = false;
	}
	
	public Camera(int numar, String tip, boolean locParcare, boolean vedere, boolean micDejun, boolean balcon) {
		super();
		this.numar = numar;
		this.tip = tip;
		this.locParcare = locParcare;
		this.vedere = vedere;
		this.micDejun = micDejun;
		this.balcon = balcon;
	}	

	public int getNumar() {
		return numar;
	}

	public void setNumar(int numar) {
		this.numar = numar;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public boolean isLocParcare() {
		return locParcare;
	}

	public void setLocParcare(boolean locParcare) {
		this.locParcare = locParcare;
	}

	public boolean isVedere() {
		return vedere;
	}

	public void setVedere(boolean vedere) {
		this.vedere = vedere;
	}

	public boolean isMicDejun() {
		return micDejun;
	}

	public void setMicDejun(boolean micDejun) {
		this.micDejun = micDejun;
	}

	public boolean isBalcon() {
		return balcon;
	}

	public void setBalcon(boolean balcon) {
		this.balcon = balcon;
	}

	@Override
	public String toString() {
		return "Camera [numar=" + numar + ", tip=" + tip + ", locParcare=" + locParcare + ", vedere=" + vedere
				+ ", micDejun=" + micDejun + ", balcon=" + balcon + "]";
	}	
}
