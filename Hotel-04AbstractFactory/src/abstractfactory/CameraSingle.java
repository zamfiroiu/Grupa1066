package abstractfactory;

public abstract class CameraSingle extends Camera {
	private int nrCamera;
	
	protected CameraSingle(int numarCamera) {
		this.nrCamera=numarCamera;
	}

	@Override
	public String toString() {
		return "CameraSingle [nrCamera=" + nrCamera + "]";
	}
	
}
