package com.doganilbars.setandmaps006;

import java.util.LinkedHashSet;

public class Test {
	public static void main(String[] args) {
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		set1.add("Adana");
		LinkedHashSet<String> set2 = set1;
		LinkedHashSet<String> set3 = (LinkedHashSet<String>) (set1.clone());
		set1.add("Osmaniye");
		System.out.println("set1 is " + set1);
		System.out.println("set2 is " + set2);
		System.out.println("set3 is " + set3);
	}

}
