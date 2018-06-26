package com.doganilbars.collections005;

import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

public class Test7 {
	public static void main(String[] args) {
		List<GregorianCalendar> list = Collections.nCopies(5, new GregorianCalendar(2005, 0, 1));
		System.out.println(list);
	}
}
