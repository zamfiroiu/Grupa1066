package prototype;

public class Client implements Prototype{
	
	private String nume;
	private String CNP;
	private String IBAN;
	
	
	public Client clone() {
		Client client=new Client();
		client.setCNP(this.CNP);
		client.setIBAN(this.IBAN);
		client.setNume(this.nume);
		return client;
	}
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		CNP = cNP;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public Client(String nume, String cNP, String iBAN) throws Exception {
		super();
		if(!nume.isEmpty()){
			this.nume = nume;
		}
		else{
			throw new Exception("Nume incorect");
		}
		if(cNP.length()==13){
			CNP = cNP;
		}else{
			throw new Exception("CNP incorect");
		}
		if(!iBAN.isEmpty()){
			IBAN = iBAN;
		}else{
			throw new Exception("IBAN incorect");			
		}
	}
	
	public Client() {

	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", CNP=" + CNP + ", IBAN=" + IBAN + "]";
	}
}
