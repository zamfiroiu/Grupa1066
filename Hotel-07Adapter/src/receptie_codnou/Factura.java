package receptie_codnou;

public class Factura {
	
	private int codFactura;
	private double sumaFactura;
	
	public Factura(int codFactura, double sumaFactura) {
		super();
		this.codFactura = codFactura;
		this.sumaFactura = sumaFactura;
	}
	
	public void printeazaFactura() {
		System.out.println("Factura cu codul "+codFactura+ " are o suma de "+sumaFactura);
	}
}
