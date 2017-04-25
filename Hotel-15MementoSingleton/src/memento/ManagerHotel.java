package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerHotel {
	private List<Memento> lista = new ArrayList<Memento>();
	
	public void adaugareMemento(Memento memento){
		lista.add(memento);
	}
	
	public Memento getMemento(int pozitie){
		return lista.get(pozitie);
	}
}
