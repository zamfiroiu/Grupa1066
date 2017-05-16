package testare;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPattern {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Primul apel!");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Ultimul apel");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("    inainte de test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("    dupa test");
	}

	@Test
	public void test() {
		System.out.println("          test 1");
	}
	@Test
	public void test2() {
		System.out.println("          test 2");
	}
}
