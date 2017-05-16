package testing;

import clase.Persoana;
import junit.framework.TestCase;

public class PersoanaTestJunit3 extends TestCase {

	public PersoanaTestJunit3(String metoda){
		super(metoda);
	}
	
	public void testCheckCNP(){
		Persoana p=new Persoana("Popescu", "1910313389932");
		assertTrue(p.checkCNP());
	}
	
	public void testGetSex() throws Exception{
		Persoana p=new Persoana("Popescu", "1910313389932");
		assertEquals("M", p.getSex());
	}
}
