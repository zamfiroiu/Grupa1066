package program;

import codexistente_imprimanta.DocumentPrintabil;
import codexistente_imprimanta.Printabil;

public class Program {

	private static void printare(Printabil printabil)
	{
		printabil.printeazaDocument();
	}
	public static void main(String[] args) {
		DocumentPrintabil doc=new DocumentPrintabil();
		printare(doc);
		
/*		Factura factura=new Factura(1234, 1234);
		AdapterFactura adapter=new AdapterFactura(factura);
		printare(adapter);*/
		
		adapterdeclase.AdapterFactura adapterFactura=new adapterdeclase.AdapterFactura(123, 123);
		printare(adapterFactura);
		
	}
	
	

}
