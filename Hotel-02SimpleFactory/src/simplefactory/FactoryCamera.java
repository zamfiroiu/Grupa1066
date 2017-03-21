package simplefactory;

public class FactoryCamera {
	public static Camera getCamera(TipCamera tipCamera, double pret) {
		switch(tipCamera){
			case cameraSingle: return new CameraSingle(pret);
			case cameraDubla: return new CameraDubla(pret);
			case apartament: return new Apartament(pret);
			default: return null;
		}
	}
}
