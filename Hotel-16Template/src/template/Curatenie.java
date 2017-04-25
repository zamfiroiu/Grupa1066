package template;

public abstract class Curatenie {

	public abstract void aranjeazaPat();
	public abstract void spalaPeJos();
	public abstract void schimbaProsoape();
	
	public final void curataCamera(){
		aranjeazaPat();
		spalaPeJos();
		schimbaProsoape();
	}
}
