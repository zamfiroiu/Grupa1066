package abstractfactory;

public class CameraSinglePaturiTwin extends CameraSingle {

	protected CameraSinglePaturiTwin(int numarCamera) {
		super(numarCamera);
	}

	@Override
	public String toString() {
		return "CameraSinglePaturiTwin "+super.toString();
	}

}
