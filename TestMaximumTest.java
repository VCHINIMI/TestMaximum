package com.vinay.TestMaximum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class TestMaximumTest {
	public static TestMaximum testMax;
	public static Integer a = new Integer(6);
	public static Integer b = new Integer(5);
	public static Integer c = new Integer(4);

	@BeforeClass
	public static void intialize() {
		testMax = new TestMaximum();
	}

//Test Cases for Maximum in Integers
	@Test
	public void testMaximumWhenMaximumIsAtFirstPosition() {
		int test = testMax.maxInteger(a, b, c);
		assertEquals(6, a);
	}

	@Test
	public void testMaximumWhenMaximumIsAtSecondPosition() {
		int test = testMax.maxInteger(b, a, c);
		assertEquals(6, a);
	}

	@Test
	public void testMaximumWhenMaximumIsAtThirdPosition() {
		int test = testMax.maxInteger(b, c, a);
		assertEquals(6, a);
	}
}