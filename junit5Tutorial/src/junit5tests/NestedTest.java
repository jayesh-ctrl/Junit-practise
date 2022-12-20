package junit5tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import junit5classes.Calculator;

public class NestedTest {
	Calculator calc;
	
	@BeforeEach
	public void init() {
		calc = new Calculator();
	} 
	
	@Nested
	class addPositiveNumbers{
		
		@Test
		public void addSmallPositiveNumber() {
			int sum = calc.add(2, 3);
			System.out.println(sum);
		}
		
		@Test
		public void addBigPositiveNumber()
		{
			int sum = calc.add(100, 500);
			System.out.println(sum);
		}
	}
	
	@Nested
	class addNegativeNumbers{
		
		@Test
		public void addSmallNegativeNumber() {
			int sum = calc.add(-2, -3);
			System.out.println(sum);
		}
		

		@Test
		public void addBigNegativeNumber()
		{
			int sum = calc.add(-100,-500);
			System.out.println(sum);
		}
	}
	
	@Nested
	class addZeroNumbers{
		
		@Test
		public void addPositiveZeroNumber()
		{
			int sum = calc.add(0,0);
			System.out.println(sum);
		}
		
		@Test
		public void addNegativeZeroNumber() {
			int sum = calc.add(-0, -0);
			System.out.println(sum);
		}
		
	}
	
	
}
