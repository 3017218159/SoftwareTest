package cn.tjuscs.st;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestPara {
	private int x;
	private boolean expected;
	private Lab1 cal;
	
	public TestPara(int x, boolean expected) {
		this.x = x;
		this.expected = expected;
	}
	
	@Before
	public void setUp() {
		cal = new Lab1();
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
			{0, true},
			{88, true},
			{89, false}
			});
	}
	
	@Test
	public void testAdd() {
		assertEquals(this.expected,cal.calculate(x));
	}
}
