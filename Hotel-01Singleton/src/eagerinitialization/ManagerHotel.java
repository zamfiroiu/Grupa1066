package eagerinitialization;

public class ManagerHotel {
	private String nume;
	private String prenume;
	
	private static final ManagerHotel instanta = new ManagerHotel();
	
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
