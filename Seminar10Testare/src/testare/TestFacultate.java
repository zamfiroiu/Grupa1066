package testare;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Facultate;

public class TestFacultate {

	@Test
	public void testSameInstance() {
		Facultate facultate1=Facultate.getInstanta("CSIE");
		Facultate facultate2=Facultate.getInstanta("REI");
		
		assertSame(facultate1, facultate2);
	}

}
