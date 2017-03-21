package builder;

public class CameraBuilder implements Builder {

	private Camera camera;
	
	public CameraBuilder() {
		camera=new Camera();
	}
	

	public CameraBuilder setNumar(int numar) {
		camera.setNumar(numar);
		return this;
	}
	

	public CameraBuilder setTip(String tip) {
		camera.setTip(tip);
		return this;
	}

	public CameraBuilder setLocParcare(boolean locParcare) {
		camera.setLocParcare(locParcare);
		return this;
	}

	public CameraBuilder setVedere(boolean vedere) {
		camera.setVedere(vedere);
		return this;
	}	

	public CameraBuilder setMicDejun(boolean micDejun) {
		camera.setMicDejun(micDejun);
		return this;
	}

	public CameraBuilder setBalcon(boolean balcon) {
		camera.setBalcon(balcon);
		return this;
	}
	
	@Override
	public Camera build() {
		
		return camera;
	}

}
