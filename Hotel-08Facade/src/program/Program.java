package program;

import codexistentet.CamereLibere;
import codexistentet.Menajera;
import facade.Facade;

public class Program {

	public static void main(String[] args) {
		int codCamera=6;
		
/*		if(Facade.verificareCamera(codCamera)){
			System.out.println("Camera este pregatita");
		}
		else{
			System.out.println("Va rugam asteptati");
		}*/
		
		System.out.println(Facade.verificareDisponibilitateCamera(codCamera));

	}

}
