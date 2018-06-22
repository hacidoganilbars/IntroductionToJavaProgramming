package com.doganilbars.generic003;

import java.util.ArrayList;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		ArrayList dates = new ArrayList();
		dates.add(new Date());
		Date date = (Date) dates.get(0);
		System.out.println(date);
	}
}
