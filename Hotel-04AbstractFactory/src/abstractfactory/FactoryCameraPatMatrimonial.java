package abstractfactory;

public class FactoryCameraPatMatrimonial implements FactoryCamera {

	private static FactoryCameraPatMatrimonial instanta = null;
	
	private FactoryCameraPatMatrimonial() {
		
	}
	
	public static synchronized FactoryCameraPatMatrimonial getInstanta(){
		if(instanta==null)
			instanta=new FactoryCameraPatMatrimonial();
		return instanta;
	}
	
	@Override
	public Camera getCameraSingle(int numarCamera) {
		return new CameraSinglePatMatrimonial(numarCamera);
	}

	@Override
	public Camera getCameraDouble(int etaj) {
		return new CameraDoublePatMatrimonial(etaj);
	}

}
