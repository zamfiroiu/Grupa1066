package enumsingleton;

public enum ManagerHotel {
	INSTANTA;
	
	private String nume;
	private String prenume;
	
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
		this.nume = nume;
		this.prenume = prenume;
	}

	
}
