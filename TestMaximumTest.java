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
		int test = testMax.maxGeneric(a, b, c);
		assertEquals(6, test);
	}

	@Test
	public void testMaximumWhenMaximumIsAtSecondPosition() {
		int test = testMax.maxGeneric(b, a, c);
		assertEquals(6, test);
	}

	@Test
	public void testMaximumWhenMaximumIsAtThirdPosition() {
		int test = testMax.maxGeneric(b, c, a);
		assertEquals(6, test);
	}

//Test Cases for Maximum in Float
	@Test
	public void testMaximumFloatWhenMaximumIsAtFirstPosition() {
		float test = testMax.maxGeneric(z, x, y);
		assertEquals(8, test);
	}

	@Test
	public void testMaximumFloatWhenMaximumIsAtSecondPosition() {
		float test = testMax.maxGeneric(y, z, x);
		assertEquals(8, test);
	}

	@Test
	public void testMaximumFloatWhenMaximumIsAtThirdPosition() {
		float test = testMax.maxGeneric(x, y, z);
		assertEquals(8, test);
	}

//Test Cases for Maximum length of String
	@Test
	public void testMaximumStringWhenMaximumIsAtFirstPosition() {
		String test = testMax.maxGeneric(o, n, m);
		assertEquals(n, test);
	}

	@Test
	public void testMaximumStringWhenMaximumIsAtSecondPosition() {
		String test = testMax.maxGeneric("vinay", "chandu", "harika");
		assertEquals("vinay", test);
	}

	@Test
	public void testMaximumStringWhenMaximumIsAtThirdPosition() {
		String test = testMax.maxGeneric("Apple", "Peach", "Banana");
		assertEquals("Peach", test);
	}

//Test Cases for Generics
	@Test
	public void GenericstestMaximumWhenMaximumIsAtFirstPosition() {
		int test = testMax.maxGeneric(6, 5, 4);
		assertEquals(6, test);
	}

	@Test
	public void GenericstestMaximumWhenMaximumIsAtFirstPosition2() {
		TestMaximum testMaxNew = new TestMaximum("Vinay", "Harika", "Chndu");
		assertEquals("Vinay", testMaxNew.maxGeneric());
	}

//Test Case for Generic function with more than 3 parameters	
	@Test
	public void GenericstestMaximumWhenMaximumIsAtFirstPositionwithMoreThan3inputs() {
		int test = testMax.maxGeneric(6, 5, 4, 9, 8, 1);
		assertEquals(9, test);
	}

}