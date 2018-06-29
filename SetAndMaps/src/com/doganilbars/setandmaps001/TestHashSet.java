package com.doganilbars.setandmaps001;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Adana");
		set.add("Osmaniye");
		set.add("Ankara");
		set.add("Bursa");
		set.add("Manisa");
		set.add("Trabzon");
		set.add("İstanbul");

		System.out.println(set);

		for (String s : set) {
			System.out.print(s.toUpperCase() + " ");
		}

	}

}
