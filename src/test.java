import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class test {

	@Test
	void test1() {
		cal tester = new cal(); // MyClass is tested
	     assertEquals(0, tester.mul(10, 0), "10 x 0 must be 0");
	   
	}
	@Test
	void test2() {
		cal tester = new cal(); // MyClass is tested
	    assertEquals(2, tester.div(10, 5), "10 / 5 must be 2");
	}
	@Test
	void test3() {
		cal tester = new cal(); // MyClass is tested
	    assertEquals(5, tester.add(2, 3), "2 + 3 must be 5");
	}
	@Test
	void test4() {
		cal tester = new cal(); // MyClass is tested
	    assertEquals(14, tester.subtract(15, 1), "15 + 1 must be 14"); 
	}
	@Test 
	void test5() {
		cal tester = new cal(); // MyClass is tested
		Assertions.assertThrows(ArithmeticException.class, () -> {
			tester.div(5, 0);
		    });
	}
	
	 
}
