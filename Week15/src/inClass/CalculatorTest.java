package inClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@SuppressWarnings("deprecation")  // what is the use of this???
	@Test
	void testAdd() {
		// delete the original one and add our implementation
		Calculator calc = new Calculator();
		double a=305.5, b=100.5;
		assertEquals(406.0, calc.add(a, b));  // Excepted answer vs. actual answer, if not equal return false;
	}

	@Test
	void testSubtract() {
		Calculator calc = new Calculator();
		double a=305.5, b=100.5;
		assertEquals(205.0, calc.subtract(a, b));
	}

	@Test
	void testProduct() {
		Calculator calc = new Calculator();
		double a=12, b=13;
		assertEquals(156, calc.product(a, b));  // here we compare the int with double result. The result is true, it means there is automatic type promotion
	}

//	@Test
//	void testDivide() {
//		Calculator calc = new Calculator();
//		double a=100, b=6;
//		assertEquals(16, Math.round(calc.divide(a, b)), "The expect return different");  // Math.round() round to the nearest integer
//		// how to round to specific decimal places
//	}
	
	@Test
	void testDivide() {
		Calculator calc = new Calculator();
		double a=305.5, b=100.5;
		
		double scale = Math.pow(10, 4);
		assertEquals(3.0398, Math.round(calc.divide(a, b)*scale)/scale, "The expect return different");  // Math.round() round to the nearest integer
		// how to round to specific decimal places
	}

}
