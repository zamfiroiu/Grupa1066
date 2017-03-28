package adapterdeclase;

import codexistente_imprimanta.Printabil;
import receptie_codnou.Factura;

public class AdapterFactura extends Factura implements Printabil {

	public AdapterFactura(int codFactura, double sumaFactura) {
		super(codFactura, sumaFactura);
	}

	@Override
	public void printeazaDocument() {
		super.printeazaFactura();
	}

	@Override
	public String scaneaza() {
		return "";
	}

}
