package bonus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testSetTotalPay() {
		// test 1: when hours <= 40
		Employee emp1 = new Employee("Cathy", 38);
		assertEquals(38*15, emp1.getTotalPay(), "Total pay for under 40 hours has mistake");
		
		// test 2: when hours > 40
		Employee emp2 = new Employee("Logi", 42);
		assertEquals(40*15 + 16.5*2, emp2.getTotalPay(), "Total pay for over 40 hours has mistake");
	}

}
