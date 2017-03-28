package decorator;

import codexistent.Factura;
import codexistent.IFactura;

public abstract class Decorator implements IFactura {

	protected Factura factura;
	
	
	public Decorator(Factura factura){
		this.factura=factura;
	}
	@Override
	public void printeazaFactura() {
		factura.printeazaFactura();
		System.out.println("La multi ani!");
	}
	
	public abstract void aplicaDiscount(int procent);
		


}
