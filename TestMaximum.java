package com.vinay.TestMaximum;

public class TestMaximum {
//	Max Integer Function	
	public static Integer maxInteger(Integer x, Integer y, Integer z) {
		int maxInteger = x;
		if (y.compareTo(maxInteger) > 0)
			maxInteger = y;
		if (z.compareTo(maxInteger) > 0)
			maxInteger = z;
		return maxInteger;
	}

//Max Float Function	
	public static Float maxFloat(Float x, Float y, Float z) {
		float maxFloat = x;
		if (y.compareTo(maxFloat) > 0)
			maxFloat = y;
		if (z.compareTo(maxFloat) > 0)
			maxFloat = z;
		return maxFloat;
	}

}
