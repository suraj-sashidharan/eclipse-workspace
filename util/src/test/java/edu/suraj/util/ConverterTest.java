package edu.suraj.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConverterTest {
	private Converter converter;
	
	@Before
	public void setUp() {
		converter = new Converter();
	}

	@Test
	public void test() {
		assertEquals(104, converter.toF(40), 0);
	}
}
