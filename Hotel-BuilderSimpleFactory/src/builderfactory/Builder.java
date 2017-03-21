package builderfactory;

public interface Builder {

	Camera build();
	public Builder setNrCamera(int nrCamera);
	public Builder setMicDejun(boolean micDejun);
	public Builder setLocParcare(boolean locParcare);
	public Builder setVedere(boolean vedere);
}
