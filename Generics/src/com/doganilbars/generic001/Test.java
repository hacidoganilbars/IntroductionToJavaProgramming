package com.doganilbars.generic001;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Comparable c = new Date();
		// Comparable<Date> c = new Date();
		System.out.println(c.compareTo("red"));
	}

}
