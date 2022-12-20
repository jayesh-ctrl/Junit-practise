package junit5tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizationTest {

	/*
	 * @ValueSource
	 * @EnumSource
	 * @MethodSource
	 * @CsvSource
	 * @CsvFileSource
	 * @ArgumentsSource
	 * 
	 * */
	
	// ---------------------@ValueSource ---------------------
	
	@ParameterizedTest(name = "{index} - Run test with args = {0}")
	@ValueSource(ints = {1,5,3,7})
	public void valueSourceTest(int args) {
		 System.out.println(args);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"apple", "banana", "Orange", "Papaya"})
	public void valueSourceTest1(String fruit) {
		System.out.println(fruit);
	}
	
	// --------------------@EnumSource -------------------------
	
	enum Fruits{
		apple,banana,orange,papaya;
	}
	
	@ParameterizedTest
	@EnumSource(Fruits.class)
	public void enumSourceTest(Fruits fruit) {
		System.out.println(fruit);
	}
	
	
	// ------------------@MethodSource--------------
	
	private static String[] value_fruits() {
		return new String[] {"apple","banana","orange","papaya","Mango"};	
	}
	
	@ParameterizedTest
	@MethodSource("value_fruits")
	public void methodSourceTest(String fruit) {
		System.out.println(fruit);
	}
	
	private static Object[] values() {
		return new Object[][] {
				{"Java", "Programming Language"},
				{"junit5","unit testing framework"},
				{"selenium","automation api"},
				{"github","repository"},
		};
	}
	
	@ParameterizedTest
	@MethodSource("values")
	public void methodSourceTest1(String technology, String description) {
		System.out.println(technology+" - "+description);
	}
	
	// ---------------------@CsvSource----------------------
	@ParameterizedTest
	@CsvSource({
		"Java, Programming Language",
		"Junit5, unit testing framework",
		"selenium, automation api",
		"github, repository"
	})
	public void csvSourceTest(String technology, String description) {
		System.out.println(technology+" --- "+description);
	}
	
	
}
