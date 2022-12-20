package junit5tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit5classes.Calculator;

public class AssertionsTest {
	
	Calculator calc;
	
	@BeforeEach
	public void init() {
		calc = new Calculator();
		//System.out.println("Initializing the calculator instance.");
	}
	
	@Test
	public void assertEqualsTest() {
		int sum = calc.add(2, 2);
//		if(sum == 2)
//		{
//			System.out.println("Test Passed..");
//		}
//		else {
//			System.out.println("Test Failed.");
//		}
		assertEquals(4, sum,"Test failed as expected value is not equal to actual value.");
	}
	
	@Test
	public void assertNotEqualsTest() {
		int sum = calc.add(2, 2);
		assertNotEquals(2, sum, "Test failed as expected value is equal to actual value.");
	}
	
	@Test
	public void assertArrayEqualsTest() {
		//assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
		Assertions.assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3,4});
		
	}
	
	@Test
	public void assertNullTest() {
		String  nullString = null;
		String notNullString = "junit5";
		Assertions.assertNull(notNullString);
	}
	
	@Test
	public void assertNotNullTest() {
		String  nullString = null;
		String notNullString = "junit5";
		Assertions.assertNotNull(nullString);
	}
	
	@Test
	public void assertTrueTest() {
		boolean trueValue = true;
		boolean falseValue = false;
		Assertions.assertTrue(falseValue);
	}
	
	@Test
	public void assertFalseTest() {
		boolean trueValue = true;
		boolean falseValue = false;
		Assertions.assertFalse(trueValue, "Test Failed as test expecting false but found true");
	}
	
}
