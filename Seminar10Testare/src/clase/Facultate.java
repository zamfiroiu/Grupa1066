package clase;

public class Facultate {
	private String nume;
	
	private static Facultate instanta=null;
	
	private Facultate(String nume){
		this.nume=nume;

	}
	
	public static Facultate getInstanta(String nume){
		if(instanta==null){
			instanta=new Facultate(nume);
		}
		return instanta;
	}
}
