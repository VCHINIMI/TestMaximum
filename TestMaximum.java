package com.vinay.TestMaximum;

public class TestMaximum {
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

//Generic Function 
	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}
}
