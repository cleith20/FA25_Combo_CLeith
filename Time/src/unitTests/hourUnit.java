package unitTests;

import static org.junit.Assert.*;

import org.junit.Test;
import code.Time;
public class hourUnit {

	@Test
	public void test() {
		Time time = new Time(6,45,30);
		int hour = time.getHour();
		
		assertEquals(6, hour);
	}

}
