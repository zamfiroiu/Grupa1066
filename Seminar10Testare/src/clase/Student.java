package clase;

public class Student {
	
	private double medie;
	public double getMedie() {
		return medie;
	}

	public String getNume() {
		return nume;
	}

	private String nume;
	public Student(){
		nume=null;
		medie=10;
	}
	
	public Student(double medie, String nume) {
		super();
		this.medie = medie;
		this.nume = nume;
	}
	
	public void calculeazaMedie(double notaLucrare, double notaTeme, double notaExamen) throws Exception{
		if(notaLucrare>10 || notaTeme>10 || notaExamen>10){
			throw new Exception("Nota prea mare!");
		}
		this.medie = (notaLucrare+notaTeme+notaExamen)/3;
	}
	
	public boolean esteRestantier(){
		return medie < 5;
	}
	
	public int calculeazaBursa(){
		int i=0;
		while(i<3){
			i++;
		}
		return 1000;
	}
}
