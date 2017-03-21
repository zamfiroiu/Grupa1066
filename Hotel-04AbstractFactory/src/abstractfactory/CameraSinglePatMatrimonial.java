package abstractfactory;

public class CameraSinglePatMatrimonial extends CameraSingle {

	protected CameraSinglePatMatrimonial(int numarCamera) {
		super(numarCamera);
	}

	@Override
	public String toString() {
		return "CameraSinglePatMatrimonial " + super.toString();
	}

}
