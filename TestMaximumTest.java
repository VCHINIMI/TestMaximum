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
	public static String m = new String("Apple");
	public static String n = new String("Peach");
	public static String o = new String("Banana");

	@BeforeClass
	public static void intialize() {
		testMax = new TestMaximum();
	}

//Test Cases for Maximum in Integers
	@Test
	public void testMaximumWhenMaximumIsAtFirstPosition() {
		int test = testMax.max(a, b, c);
		assertEquals(6, test);
	}

	@Test
	public void testMaximumWhenMaximumIsAtSecondPosition() {
		int test = testMax.max(b, a, c);
		assertEquals(6, test);
	}

	@Test
	public void testMaximumWhenMaximumIsAtThirdPosition() {
		int test = testMax.max(b, c, a);
		assertEquals(6, test);
	}

//Test Cases for Maximum in Float
	@Test
	public void testMaximumFloatWhenMaximumIsAtFirstPosition() {
		float test = testMax.max(z, x, y);
		assertEquals(8, test);
	}

	@Test
	public void testMaximumFloatWhenMaximumIsAtSecondPosition() {
		float test = testMax.max(y, z, x);
		assertEquals(8, test);
	}

	@Test
	public void testMaximumFloatWhenMaximumIsAtThirdPosition() {
		float test = testMax.max(x, y, z);
		assertEquals(8, test);
	}

//Test Cases for Maximum length of String
	@Test
	public void testMaximumStringWhenMaximumIsAtFirstPosition() {
		int test = testMax.max(o, n, m);
		assertEquals(o.length(), test);
	}

	@Test
	public void testMaximumStringWhenMaximumIsAtSecondPosition() {
		int test = testMax.max(n, o, m);
		assertEquals(o.length(), test);
	}

	@Test
	public void testMaximumStringWhenMaximumIsAtThirdPosition() {
		int test = testMax.max(n, m, o);
		assertEquals(o.length(), test);
	}

//Test Cases for Generics
	@Test
	public void GenericstestMaximumWhenMaximumIsAtFirstPosition() {
		int test = testMax.max(a, b, c);
		assertEquals(6, test);
	}

}