package com.doganilbars.setandmaps002;

import java.util.HashSet;
import java.util.Set;

public class TestMethodsInCollection {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("Adana");
		set1.add("Osmaniye");
		set1.add("Balýkesit");
		set1.add("Manisa");
		set1.add("Bursa");
		set1.add("Trabzon");
		set1.add("Ankara");
		set1.add("Ýstanbul");

		System.out.println("set1 is " + set1);
		System.out.println(set1.size() + " elements in set1");

		set1.remove("Adana");
		System.out.println("\nset1 is " + set1);
		System.out.println(set1.size() + " elements in set1");

		Set<String> set2 = new HashSet<>();
		set2.add("Adana");
		set2.add("Kayseri");
		set2.add("Osmaniye");

		System.out.println("\nset2 is " + set2);
		System.out.println(set2.size() + " elements in set2");

		System.out.println("\nIn Çanakkale in set2? " + set2.contains("Çanakkale"));

		set1.addAll(set2);
		System.out.println("\nAfter adding set2 to set1, set1 is " + set1);

		set1.removeAll(set2);
		System.out.println("After removing set2 from set1, set1 is " + set1);

		set1.retainAll(set2);
		System.out.println("After removing common elements in set2 from set1, set1 is " + set1);

	}

}
