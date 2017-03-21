package builderfactory;

public abstract class Camera {
	private int nrCamera;
	private boolean micDejun;
	private boolean locParcare;
	private boolean vedere;
	
	public Camera() {
		super();
	}
	
	@Override
	public String toString() {
		return "Camera [nrCamera=" + nrCamera + ", micDejun=" + micDejun + ", locParcare=" + locParcare + ", vedere="
				+ vedere + "]";
	}

	public int getNrCamera() {
		return nrCamera;
	}
	public void setNrCamera(int nrCamera) {
		this.nrCamera = nrCamera;
	}
	public boolean isMicDejun() {
		return micDejun;
	}
	public void setMicDejun(boolean micDejun) {
		this.micDejun = micDejun;
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
	
	
}
