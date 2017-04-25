package program;

import proxy.ProxyRezervare;
import proxy.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare=new Rezervare(1, 111);		
		//rezervare.anulareRezervare();

		ProxyRezervare proxy=new ProxyRezervare(rezervare) ;
		proxy.anulareRezervare();
	}

}
