package junit5tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutsTest {

	@Test
	@Timeout(6)
	public void timeoutTest() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Test Passed with in the time.");
	}
	
	@Test
	@Timeout(6)
	public void timeoutTest1() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Test Passed with in the time.");
	}
	
	@Test
	public void timeoutTest2() {
		
		Assertions.assertTimeout(Duration.ofSeconds(7), () -> delaySeconds(6));
	}
	
	private void delaySeconds(int seconds) throws InterruptedException
	{
		TimeUnit.SECONDS.sleep(seconds);
		
	}
}
