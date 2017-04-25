package program;

import template.Curatenie;
import template.CuratenieCameraNormala;
import template.CuratenieCameraTwin;

public class Program {

	public static void main(String[] args) {
		Curatenie curatenieNormala=new CuratenieCameraNormala();
		curatenieNormala.curataCamera();
		
		Curatenie curatenieTwin=new CuratenieCameraTwin();
		curatenieTwin.curataCamera();

	}

}
