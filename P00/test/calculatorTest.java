import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * yanzi, 31 May 2023 5:00:21 pm
 */

public class calculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	public void testAdd() {
		int a = 4321;
		int b = 1234;
		
		calculator cal = new calculator();
		
		int actual = cal.add(a, b);
		int expected = 5555;
		
		assertEquals(expected, actual);
		
	}
	
	public void testSubtract() {
		int a = 8765;
		int b = 1111;
		
		calculator cal = new calculator();
		
		int actual = cal.subtract(a, b);
		int expected = 7654;
		
		assertEquals(expected, actual);
		
	}
	
	public void testMultiply() {
		int a = 123;
		int b = 11;
		
		calculator cal = new calculator();
		
		int actual = cal.add(a, b);
		int expected = 1353;
		
		assertEquals(expected, actual);
		
	}
	
	public void testDivide() {
		int a = 8888;
		int b = 8;
		
		calculator cal = new calculator();
		
		int actual = cal.add(a, b);
		int expected = 1111;
		
		assertEquals(expected, actual);
		
	}

}
