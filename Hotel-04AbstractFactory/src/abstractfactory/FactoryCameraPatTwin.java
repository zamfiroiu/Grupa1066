package abstractfactory;

public class FactoryCameraPatTwin implements FactoryCamera {

	@Override
	public Camera getCameraSingle(int numarCamera) {
		return new CameraSinglePaturiTwin(numarCamera);
	}

	@Override
	public Camera getCameraDouble(int etaj) {
		return new CameraDoublePatTwin(etaj);
	}

}
