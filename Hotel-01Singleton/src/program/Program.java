package program;

import lazyinitialization.ManagerHotel;

public class Program {

	public static void main(String[] args) {
	ManagerHotel manager1=ManagerHotel.getInstance("Ionescu", "Ion");
	ManagerHotel manager2=ManagerHotel.getInstance("Vasilescu", "Gigel");
	
	
	System.out.println(manager1.toString());
	System.out.println(manager2.toString());
	
	enumsingleton.ManagerHotel.INSTANTA.setNume("Georgescu");
	enumsingleton.ManagerHotel.INSTANTA.setPrenume("Vasile");
	System.out.println(enumsingleton.ManagerHotel.INSTANTA.toString());
	

	}

}
