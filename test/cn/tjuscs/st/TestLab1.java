package cn.tjuscs.st;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestLab1 {
	Lab1 cal;
	
	@Before
	public void setUp() {
		cal = new Lab1();
	}
	
	@Test
	public void testCal() {
		boolean result = cal.calculate(88);
		assertEquals(true, result);
	}
}
