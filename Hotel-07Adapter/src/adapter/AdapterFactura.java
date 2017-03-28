package adapter;

import codexistente_imprimanta.Printabil;
import receptie_codnou.Factura;

public class AdapterFactura implements Printabil {

	private Factura factura;
	
	public AdapterFactura(Factura factura) {
		this.factura=factura;
	}
	
	@Override
	public void printeazaDocument() {
		this.factura.printeazaFactura();
	}

	@Override
	public String scaneaza() {
		return "";
	}

}
