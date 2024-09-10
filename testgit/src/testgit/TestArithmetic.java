package testgit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArithmetic {
	Arithmetic arth = new Arithmetic();

	@Test
	public void testAdd() {
		assertEquals(10, arth.add(5, 5));  
	}
}
