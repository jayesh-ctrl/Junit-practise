package junit5tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TaggingTest {

	@Test
	@Tag("smoke")
	public void taggingTest1() {
		System.out.println("This is smoke test in tagging 1 method.");
	}
	
	@Test
	@Tag("sanity")
	public void taggingTest2() {
		System.out.println("This is sanity test in tagging 2 method.");
	}
	
	@Test
	@Tag("smoke")
	public void taggingTest3() {
		System.out.println("This is smoke test in tagging 3 method.");
	}
	
	@Test
	@Tag("sanity")
	public void taggingTest4() {
		System.out.println("This is sanity test in tagging 4 method.");
	}
	
	@Test
	@Tag("smoke")
	public void taggingTest5() {
		System.out.println("This is smoke test in tagging 5 method.");
		}
	
	@Test
	@Tag("sanity")
	@Tag("regression")
	public void taggingTest6() {
		System.out.println("This is regression + sanity test in tagging 6 method.");
	}
}
