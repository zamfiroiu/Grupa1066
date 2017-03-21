package abstractfactory;

public class CameraDoublePatMatrimonial extends CameraDouble {

	protected CameraDoublePatMatrimonial(int etaj) {
		super(etaj);
	}

	@Override
	public String toString() {
		return "CameraDoublePatMatrimonial "+super.toString();
	}
}
