package chain;

import observer.Client;

public class NotificatorManager extends Notificator{

	@Override
	public void notifica(Client client, String mesaj) {
		// TODO Auto-generated method stub
		System.out.println("Nu avem date pentru clientul "+client.getNume());
		
	}

}
