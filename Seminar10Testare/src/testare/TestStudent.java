package testare;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class TestStudent {

	@Test
	public void test() throws Exception {
		Student student=new Student(10, "Popescu");
		student.calculeazaMedie(7, 8, 8.5);
		assertEquals(7.83, student.getMedie(), 0.01);
	}
	
	@Test
	public void testNumeNull(){
		Student student=new Student();
		assertNull(student.getNume());
	}
	
	@Test
	public void testNumeNotNull(){
		Student student=new Student(10,"Popescu");
		assertNotNull(student.getNume());
	}
	
	@Test
	public void testEsteRestantier() throws Exception{
		Student student=new Student(4.99,"Popescu");
		assertTrue(student.esteRestantier());
		student.calculeazaMedie(3, 4, 3);
		assertTrue(student.esteRestantier());
		student.calculeazaMedie(6, 7, 9);
		assertFalse(student.esteRestantier());
	}
	
	@Test
	public void testExceptie(){
		Student student=new Student(10, "Popescu");
		try {
			student.calculeazaMedie(12, 10, 5);
			fail("Nu trebuia sa ajung aici");
		} catch (Exception e) {

		}		
	}
	
	@Test(timeout=100)
	public void testCalculeazaBursa(){
		Student student=new Student(10, "Popescu");
		student.calculeazaBursa();
	}

}
