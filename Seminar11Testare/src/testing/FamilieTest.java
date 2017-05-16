package testing;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Familie;
import clase.IPersoana;
import clase.Persoana;
import clase.PersoanaMock;

public class FamilieTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Category(TesteInmultire.class)
	public void test() {
		IPersoana sot=new PersoanaMock();
		IPersoana sotie=new PersoanaMock();
		
		Familie familie=new Familie(sot, sotie);
		
		assertTrue(familie.checkFamilie());
	}
	
	
	@Test
	public void testCheckFamilie(){
		Persoana sot=mock(Persoana.class);
		Persoana sotie=mock(Persoana.class);
		
		when(sot.getVarsta()).thenReturn(23);
		when(sotie.getVarsta()).thenReturn(22);
		
		
		Familie familie=new Familie(sot, sotie);
		
		assertTrue(familie.checkFamilie());
	}
	

}
