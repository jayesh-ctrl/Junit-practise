package junit5tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import junit5classes.Calculator;

@TestInstance(Lifecycle.PER_CLASS)
public class BeforeandAfterAnnotationTest {
	
	Calculator calc;
	
	@BeforeAll
	public void beforeAllMethod() {
		System.out.println("Establishing connection to the Database.");
	}
	
	@AfterAll
	public void afterAllMethod() {
		System.out.println("Closing connection of Database.");
	}
	
	@BeforeEach
	public void init() {
		calc = new Calculator();
		System.out.println("Initializing the calculator instance.");
	}

	@Test
	@DisplayName("Adding 2 Positive Numbers")
	public void testMethod1() {
		
		int sum = calc.add(10, 20);
		System.out.println("The total is : "+sum);
	}
	
	
	@DisplayName("Adding 2 negative numbers")
	@Test
	public void testMethod2() {
//		calc = new Calculator();
		int sum = calc.add(-20, -30);
		System.out.println("The total is : "+ sum);
	}
	
	@AfterEach
	public void teatDown() {
		System.out.println("Test Method executed Successfully...!!!");
	}
	
	
}
