package abstractfactory;

public class CameraDoublePatTwin extends CameraDouble {

	protected CameraDoublePatTwin(int etaj) {
		super(etaj);
	}

	@Override
	public String toString() {
		return "CameraDoublePatTwin "+super.toString();
	}
}
