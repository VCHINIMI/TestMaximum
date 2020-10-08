package com.vinay.TestMaximum;

public class TestMaximum {
	
//	Max Integer Function	
	public static Integer maxInteger(Integer x,Integer y, Integer z) {
		int maxInteger = x;
		if(y.compareTo(maxInteger)>0)
			maxInteger = y;
		if (z.compareTo(maxInteger)>0)
			maxInteger = z;
		return maxInteger;		
	}
}
