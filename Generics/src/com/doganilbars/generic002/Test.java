package com.doganilbars.generic002;

import java.util.ArrayList;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		ArrayList dates = new ArrayList();
		dates.add(new Date());
		dates.add(new String("ABC"));
		System.out.println(dates.get(0));
		System.out.println(dates.get(1));
	}

}
