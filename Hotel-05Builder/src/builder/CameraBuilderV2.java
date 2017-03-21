package builder;

public class CameraBuilderV2 implements Builder {

	private int numar;
	private String tip;
	private boolean locParcare;
	private boolean vedere;
	private boolean micDejun;
	private boolean balcon;

	
	public CameraBuilderV2(){
		
	}
	
	public CameraBuilderV2 setNumar(int numar) {
		this.numar = numar;
		return this;
	}

	public CameraBuilderV2 setTip(String tip) {
		this.tip = tip;
		return this;
	}

	public CameraBuilderV2 setLocParcare(boolean locParcare) {
		this.locParcare = locParcare;
		return this;
	}

	public CameraBuilderV2 setVedere(boolean vedere) {
		this.vedere = vedere;
		return this;
	}

	public CameraBuilderV2 setMicDejun(boolean micDejun) {
		this.micDejun = micDejun;
		return this;
	}

	public CameraBuilderV2 setBalcon(boolean balcon) {
		this.balcon = balcon;
		return this;
	}

	@Override
	public Camera build() {
		Camera camera=new Camera(numar, tip, locParcare, vedere, micDejun, balcon);
		return camera;
	}

}
