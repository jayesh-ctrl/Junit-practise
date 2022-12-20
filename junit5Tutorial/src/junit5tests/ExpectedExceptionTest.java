package junit5tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExpectedExceptionTest {

	@Test
	public void expectedExceptionsTest1() {
		Assertions.assertThrows(ArithmeticException.class, () -> divide(1,0));
		System.out.println("Test passed as we handled the exceptions.");
	}
	
	@Test
	public void expectedExceptionsTest2() {
		Assertions.assertThrows(ArithmeticException.class, () -> divide(1,1));
		System.out.println("Test passed as we handled the exceptions.");
	}
	
	@Test
	public void expectedExceptionsTest3() {
		Assertions.assertThrows(FileNotFoundException.class, () -> readFile());
		System.out.println("Test passed as we handled the exceptions.");
	}
	 
	
	
	//Super Type Exception
	@Test
	public void expectedExceptionsTest4() {
		Assertions.assertThrows(IOException.class, () -> readFile());
		System.out.println("Test passed as we handled the exceptions.");
	}
	
	
	private int divide(int a, int b)
	{
		return a/b;
	}
	
	private void readFile() throws IOException {
		FileInputStream fis = new FileInputStream("./abcd.xls");
		fis.read();
		fis.close();
	}
}
