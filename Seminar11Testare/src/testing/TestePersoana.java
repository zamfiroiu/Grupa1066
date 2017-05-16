package testing;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import clase.Persoana;

public class TestePersoana {

	FileReader fileReader;
	BufferedReader reader;
	
	@Test
	public void testCheckCNP() {
		Persoana p=new Persoana("Popescu", "1921204325416");
		assertTrue(p.checkCNP());
	}
	
	@Before
	public void initializare(){
		try {
			fileReader=new FileReader("cnp.txt");
			reader=new BufferedReader(fileReader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@After
	public void inchidere(){
		try {
			reader.close();
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testCheckCNPFile(){
		String linie=null;
		try {
			while((linie=reader.readLine())!=null){
				Persoana p=new Persoana("Popescu", linie);
				assertTrue("Testul a picat pentru CNP-ul:"+linie, p.checkCNP());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
