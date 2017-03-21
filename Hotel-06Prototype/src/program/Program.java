package program;

import prototype.Client;

public class Program {

	public static void main(String[] args) {
		try {
			Client client1 = new Client("Popescu", "1234567890123", "53452345");
			System.out.println(client1.toString());
			
			Client client2=client1.clone();
			System.out.println(client2.toString());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
