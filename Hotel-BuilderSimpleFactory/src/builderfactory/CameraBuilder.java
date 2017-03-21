package builderfactory;

public class CameraBuilder implements Builder {

	private Camera camera;
	
	public CameraBuilder(TipCamera tipCamera){
		switch(tipCamera){
			case SINGLE: camera=new CameraSingle();break;
			case DOUBLE: camera=new CameraDouble();break;
			default: camera=null;
		}
	}
	
	@Override
	public Camera build() {
		return camera;
	}

	@Override
	public Builder setNrCamera(int nrCamera) {
		camera.setNrCamera(nrCamera);
		return this;
	}

	@Override
	public Builder setMicDejun(boolean micDejun) {
		camera.setMicDejun(micDejun);
		return this;
	}

	@Override
	public Builder setLocParcare(boolean locParcare) {
		camera.setLocParcare(locParcare);
		return this;
	}

	@Override
	public Builder setVedere(boolean vedere) {
		camera.setVedere(vedere);
		return this;
	}

}
