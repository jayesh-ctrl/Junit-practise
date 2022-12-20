package junit5tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit5classes.Calculator;

// this is not best way to create object of Calculator


@Disabled("Not Executing as the functionality is not working")
public class TestAnnotationTest {

	@Test
	@DisplayName("Adding 2 Positive Numbers")
	public void testMethod1() {
		Calculator calc = new Calculator();
		int sum = calc.add(10, 20);
		System.out.println("The total is : "+sum);
	}
	
	
	@DisplayName("Adding 2 negative numbers")
	@Test
	// @Disabled("Not Executing as the functionality is not working")
	public void testMethod2() {
		Calculator clac = new Calculator();
		int sum = clac.add(-20, -30);
		System.out.println("The total is : "+ sum);
	}
	
	
	@Test
	private void testMethod3()
	{
		Calculator clac = new Calculator();
		int sum = clac.add(-40, -30);
		System.out.println("The total is : "+ sum);
	}
}
