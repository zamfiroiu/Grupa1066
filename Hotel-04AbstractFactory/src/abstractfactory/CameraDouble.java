package abstractfactory;

public abstract class CameraDouble extends Camera {
	private int etaj;
	
	protected CameraDouble(int etaj) {
		this.etaj=etaj;
	}

	@Override
	public String toString() {
		return "CameraDouble [etaj=" + etaj + "]";
	}
	
}
