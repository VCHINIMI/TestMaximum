package com.vinay.TestMaximum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class TestMaximumTest {
	public static TestMaximum testMax;
	public static Integer a = new Integer(6);
	public static Integer b = new Integer(5);
	public static Integer c = new Integer(4);
	public static Float x = new Float(6);
	public static Float y = new Float(7);
	public static Float z = new Float(8);

	@BeforeClass
	public static void intialize() {
		testMax = new TestMaximum();
	}

//Test Cases for Maximum in Integers
	@Test
	public void testMaximumWhenMaximumIsAtFirstPosition() {
		int test = testMax.maxInteger(a, b, c);
		assertEquals(6, test);
	}

	@Test
	public void testMaximumWhenMaximumIsAtSecondPosition() {
		int test = testMax.maxInteger(b, a, c);
		assertEquals(6, test);
	}

	@Test
	public void testMaximumWhenMaximumIsAtThirdPosition() {
		int test = testMax.maxInteger(b, c, a);
		assertEquals(6, test);
	}

//Test Cases for Maximum in Float
	@Test
	public void testMaximumFloatWhenMaximumIsAtFirstPosition() {
		float test = testMax.maxFloat(z, x, y);
		assertEquals(8, test);
	}

	@Test
	public void testMaximumFloatWhenMaximumIsAtSecondPosition() {
		float test = testMax.maxFloat(y, z, x);
		assertEquals(8, test);
	}

	@Test
	public void testMaximumFloatWhenMaximumIsAtThirdPosition() {
		float test = testMax.maxFloat(x, y, z);
		assertEquals(8, test);
	}
}