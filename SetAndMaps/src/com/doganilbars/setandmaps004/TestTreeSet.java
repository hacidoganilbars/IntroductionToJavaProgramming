package com.doganilbars.setandmaps004;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("Osmaniye");
		set.add("Adana");
		set.add("Balýkesir");
		set.add("Kütahya");
		set.add("Ýstanbul");
		set.add("Samsun");
		set.add("Ankara");
		set.add("Rize");

		TreeSet<String> treeSet = new TreeSet<>(set);
		System.out.println("Sorted tree set " + treeSet);

		System.out.println("first(): " + treeSet.first());
		System.out.println("last(): " + treeSet.last());
		System.out.println("headSet(\"Osmaniye\"): " + treeSet.headSet("Osmaniye"));
		System.out.println("tailSet(\"Osmaniye\"): " + treeSet.tailSet("Osmaniye"));
		System.out.println("lover(\"S\"): " + treeSet.lower("S"));
		System.out.println("higher(\"S\"): " + treeSet.higher("S"));
		System.out.println("floor(\"S\"): " + treeSet.floor("S"));
		System.out.println("ceiling(\"S\"): " + treeSet.ceiling("S"));
		System.out.println("pollFirst(): " + treeSet.pollFirst());
		System.out.println("pollLast(): " + treeSet.pollLast());
		System.out.println("New treeSet: " + treeSet);
	}
}
