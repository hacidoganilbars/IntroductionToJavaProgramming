package com.doganilbars.setandmaps003;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("Adana");
		set.add("Osmaniye");
		set.add("Bursa");
		set.add("Manisa");
		set.add("Samsun");
		set.add("İstanbul");
		System.out.println(set);

		for (String s : set) {
			System.out.print(s.toLowerCase() + " ");
		}

	}
}
