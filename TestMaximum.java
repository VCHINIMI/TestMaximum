package com.vinay.TestMaximum;

public class TestMaximum<T extends Comparable<T>> {
	T genericE;
	T genericF;
	T genericG;

//	Constructor	
	public TestMaximum(T genericE, T genericF, T genericG) {
		super();
		this.genericE = genericE;
		this.genericF = genericF;
		this.genericG = genericG;
	}

//Empty Constructor for already defined test cases	
	public TestMaximum() {
	}

//	Max Integer Function	
	public static Integer max(Integer x, Integer y, Integer z) {
		int maxInteger = x;
		if (y.compareTo(maxInteger) > 0)
			maxInteger = y;
		if (z.compareTo(maxInteger) > 0)
			maxInteger = z;
		return maxInteger;
	}

//Max Float Function	
	public static Float max(Float x, Float y, Float z) {
		float maxFloat = x;
		if (y.compareTo(maxFloat) > 0)
			maxFloat = y;
		if (z.compareTo(maxFloat) > 0)
			maxFloat = z;
		return maxFloat;
	}

//Max Length String Function
	public static int max(String x, String y, String z) {
		int maxStringLength = x.length();
		if ((y.length()) - (maxStringLength) > 0)
			maxStringLength = y.length();
		if (z.length() - maxStringLength > 0)
			maxStringLength = z.length();
		return maxStringLength;
	}

//	TestMaximum method calling static maxGeneric method
	public T maxGeneric() {
		return maxGeneric(this.genericG, this.genericE, this.genericF);
	}

// Print Method
	public static <T> void printGeneric(T generic) {
		System.out.println(generic);
	}

//Max Function with Generics, more than 3 parameters	
	public static <T extends Comparable<T>> T maxGeneric(T... elements) {
		T max = elements[0];
		for (T element : elements) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		printGeneric(max);
		return max;
	}

}
