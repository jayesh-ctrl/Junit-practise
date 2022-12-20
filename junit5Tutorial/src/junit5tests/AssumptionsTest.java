package junit5tests;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
	
	@Test
	public void assumeTrueTest() {
		Assumptions.assumeTrue(false);
		
		//if(false)
		//Assertions.assertTrue(false);
			System.out.println("Executing as assumption is true.");
	}
	
	@Test
	public void assumeFalseTest() {
		Assumptions.assumeFalse(true);
		System.out.println("Executing as assumption is false");
	}
	
	
}
