package program;

import simplefactory.Camera;
import simplefactory.FactoryCamera;
import simplefactory.TipCamera;

public class Program {

	public static void main(String[] args) {
		//FactoryCamera fabrica=new FactoryCamera();
		
		Camera camera=FactoryCamera.getCamera(TipCamera.apartament, 80);
		System.out.println(camera.getDescriere()+" "+camera.getPret());

	}

}
