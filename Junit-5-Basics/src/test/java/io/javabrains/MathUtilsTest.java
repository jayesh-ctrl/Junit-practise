package io.javabrains;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;


class MathUtilsTest {

	MathUtils mathUtils;
	TestInfo testInfo;
	TestReporter testReporter;
	
	
	@BeforeEach
	void mandatory(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		mathUtils = new MathUtils();
		testReporter.publishEntry("Running "+testInfo.getDisplayName()+" with tag " + testInfo.getTags());
	}
	
	@Test
	void testAdd() {
		int expected = 2;
		int actual = mathUtils.add(20, 32);
		Assertions.assertEquals(expected, actual,()-> "should return "+expected+" Jayesh");
		System.out.println("This test ran.");
	}
	
	@Test
	@Tag("Math")
	@DisplayName("Multiply Method")
	void testMultiply() {
		testReporter.publishEntry("Running "+testInfo.getDisplayName()+" with tag " + testInfo.getTags());
		//assertEquals(4, mathUtils.multiply(2, 2),"should return the right product.");
		assertAll(
				() -> assertEquals(4, mathUtils.multiply(2, 2),"should return the right product."),
				() -> assertEquals(0, mathUtils.multiply(2, 0),"should return the right product."),
				() -> assertEquals(-2, mathUtils.multiply(2, -1),"should return the right product.")
				);
		
	}
	
	@Test
	void testComputeCircleRadius() {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10),"Should return right circle area.");
	}
	
	@Test
	void testDivide() {
	
		assertThrows(NullPointerException.class, ()->mathUtils.divide(1, 0),"divide by zero should throw.");
		
		
	}
}
