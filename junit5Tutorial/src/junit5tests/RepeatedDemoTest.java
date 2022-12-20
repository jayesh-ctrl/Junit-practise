package junit5tests;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedDemoTest {

	//@Test
	@org.junit.jupiter.api.RepeatedTest(3)
	public void repeatedTestMethod() {
		System.out.println("I am executing this test multiple times.");
	}
	
	@org.junit.jupiter.api.RepeatedTest(value = 4, name = "{displayName} - repetition - {currentRepetition}/{totalRepetitions}")
	public void repeatedTestMethod1() {
		System.out.println("Repeat Test Method 1");
	}
	
	
	@org.junit.jupiter.api.RepeatedTest(value = 4, name = RepeatedTest.LONG_DISPLAY_NAME)
	public void repeatedTestMethod2() {
		System.out.println("Repeat Test Method 2");
	}
	
	@org.junit.jupiter.api.RepeatedTest(value = 4, name = RepeatedTest.SHORT_DISPLAY_NAME)
	public void repeatedTestMethod3() {
		System.out.println("Repeat Test Method 3");
	}
	
	@RepeatedTest(3)
	public void repeatedTestMethod4(RepetitionInfo repetitionInfo) {
		System.out.println("RepeatedTestMethod4");
		System.out.println(repetitionInfo.getCurrentRepetition());
		System.out.println(repetitionInfo.getTotalRepetitions());
	}
}
