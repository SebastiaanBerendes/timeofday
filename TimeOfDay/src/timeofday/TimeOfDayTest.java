package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay tijd = new TimeOfDay(15,24);
		assertEquals(15,tijd.getUur());
		assertEquals(24,tijd.getMinuut());
		
		tijd.setUur(2);
		assertEquals(2,tijd.getUur());	
		tijd.setMinuut(12);
		assertEquals(12,tijd.getMinuut());
		assertEquals(132, tijd.getMinuutSinceMidnight());
	}

}
