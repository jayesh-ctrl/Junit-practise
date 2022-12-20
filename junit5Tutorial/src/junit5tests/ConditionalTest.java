package junit5tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {
	/*
	 * 1. Condition on Operating System
	 * 2. Condition on particular JRE
	 * 3. Condition on JRE range
	 * 4. Condition on System Properties
	 * */
	
	@Test
	@EnabledOnOs({OS.WINDOWS, OS.MAC})
	public void conditionOnOs() {
		System.out.println("Execute this test only in Window Machine");
	}
		
	@Test
	@EnabledOnJre(JRE.JAVA_17)
	public void conditionOnJRE() {
		System.out.println("Execute This test only for Java 17.");
	}
	
	@Test
	@EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_18)
	public void conditionONJreRange() {
		System.out.println("Execute this test only for range 8-17");
	}
	
	@Test
//	@EnabledIfSystemProperty(named="user.dir",matches="C:\\Users\\JayeshGupta\\Desktop\\Junit5 Practise\\junit5Tutorial")
	public void conditionOnSystemProperty() {
		System.out.println(System.getProperty("user.dir"));
	}
}
