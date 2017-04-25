package program;

import memento.Hotel;
import memento.ManagerHotel;

public class Program {

	public static void main(String[] args) {

		Hotel hotel=Hotel.getInstanta("Sheraton", 300, 0);
		
		ManagerHotel manager=new ManagerHotel();
		
		manager.adaugareMemento(hotel.salveazaMemento());
		hotel.rezervaCamere(4);
		manager.adaugareMemento(hotel.salveazaMemento());
		hotel.rezervaCamere(6);
		manager.adaugareMemento(hotel.salveazaMemento());
		hotel.rezervaCamere(2);
		
		System.out.println(hotel);
		hotel.restaureaza(manager.getMemento(1));
		System.out.println(hotel);
		
		
		

	}

}
