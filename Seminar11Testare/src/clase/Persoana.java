package clase;

import java.util.Calendar;

public class Persoana implements IPersoana {

	public String CNP;
	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		CNP = cNP;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String nume;
	
	public Persoana(String nume, String CNP){
		this.nume=nume;
		this.CNP=CNP;
	}
	
	public double inmultire(double a, double b){
		return a*b;
	}
	
	public String getSex() throws Exception{
		switch(CNP.charAt(0)){
			case '1': return "M";
			case '2': return "F";
			case '3': return "M";
			case '4': return "F";
			case '5': return "M";
			case '6': return "F";
			default: throw new Exception("CNP invalid");
		}
	}
	
	public int getVarsta(){
		return 15;
		//return Calendar.getInstance().get(1) - (1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
	}
		
	public boolean checkCNP(){
		int s=0;
		 String number="279146358279";
		for(int i=0;i<12;i++){
			s+=Integer.parseInt(""+number.charAt(i))*Integer.parseInt(""+CNP.charAt(i));			
		}
		int cifra=s%11;
		if(cifra==10)
			cifra=1;
		return cifra==Integer.parseInt(""+CNP.charAt(12));
	}	
}