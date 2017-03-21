package program;

import abstractfactory.*;

public class Program {

	public static void main(String[] args) {
		FactoryCamera fabrica1 = FactoryCameraPatMatrimonial.getInstanta();
		FactoryCamera fabrica2 = FactoryCameraPatMatrimonial.getInstanta();
		

		FactoryCamera fabrica3 = new FactoryCameraPatTwin();
		FactoryCamera fabrica4 = new FactoryCameraPatTwin();
		
		System.out.println(fabrica1.hashCode());
		System.out.println(fabrica2.hashCode());
		System.out.println(fabrica3.hashCode());
		System.out.println(fabrica4.hashCode());
		
//		Camera cameraSingle = fabrica.getCameraSingle(45);
//		
//		Camera cameraDouble=fabrica.getCameraDouble(2);
//		
//		System.out.println(cameraSingle.toString());
//		System.out.println(cameraDouble.toString());

	}

}
