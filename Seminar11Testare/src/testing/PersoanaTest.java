package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Persoana;

public class PersoanaTest {

	private  Persoana p;
	
	@Before
	public void initializare(){
		p=new Persoana("Popescu", "1841203121521"); 
	}
	
	@Test
	public void testGetVarsta(){
		assertEquals(32, p.getVarsta());
	}
	
	@Test
	public void testCheckCNP() {
		assertTrue(p.checkCNP());
	}
	
	@Test
	public void testGetSex(){
		//comenatiru
		try{
			p.setCNP("39954356346342");
			assertEquals("M", p.getSex());
			p.setCNP("61604383223");
			assertEquals("F", p.getSex());
		}catch(Exception exceptie){
			
		}
	}
	
	@Test
	@Category(TesteInmultire.class)
	public void testInmultire(){
		double a=4;
		double b=3;
		double c=p.inmultire(a, b);
		assertEquals(a, c/b, 0.001);
	}
	
	@Test
	@Category(TesteInmultire.class)
	public void testAdunareRepetata(){
		double a=4;
		double b=3;
		double c=0;
		for(int i=0;i<b;i++){
			c+=a;
		}
		assertEquals(c, p.inmultire(a, b), 0.001);
	}
	
	@Test
	public void testGetSexError(){
		p.setCNP("a23445634634");
		try{
			String sex=p.getSex();
			fail("metoda trebuia sa arunce exceptie");
		}catch(Exception exceptie){
			
		}
	}
	
	@Test(timeout=10)
	public void testCheckCNPPerformance(){
		p.checkCNP();
	}

}
