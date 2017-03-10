package staticblock;

public class ManagerHotel {
	private String nume;
	private String prenume;
	
	private static ManagerHotel instanta;
	
	static{
		try{
			instanta=new ManagerHotel();
		} catch(Exception exception) {
			System.out.println(exception);
		}
	}
	
	public static ManagerHotel getInstance(String nume, String prenume) {
		return instanta;
	}
	
	@Override
	public String toString() {
		return "ManagerHotel [nume=" + nume + ", prenume=" + prenume + "]";
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	private ManagerHotel() {
		this("Popescu","Ion");
	}
	
	private ManagerHotel(String nume, String prenume) {
		super();
		this.nume = nume;
		this.prenume = prenume;
	}

	
}
