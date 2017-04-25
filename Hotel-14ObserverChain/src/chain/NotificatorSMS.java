package chain;

import observer.Client;

public class NotificatorSMS extends Notificator {

	@Override
	 public void notifica(Client client, String mesaj) {
		if(client.getNrTelefon()!= null) {
			client.primesteSMS(mesaj);
		}
		else {
			super.getSuccesor().notifica(client, mesaj);
		}
	
	}

}
