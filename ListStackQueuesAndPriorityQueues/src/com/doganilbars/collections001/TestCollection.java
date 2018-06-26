package com.doganilbars.collections001;

import java.util.ArrayList;

public class TestCollection {
	public static void main(String[] args) {
		
		ArrayList<String> collection1 = new ArrayList<>();
		collection1.add("Adana");
		collection1.add("Osmaniye");
		collection1.add("Ýstanbul");
		collection1.add("Ankara");
		System.out.println("A list of cities in collection1:");
		System.out.println(collection1);

		System.out.println("\nIs Ýstanbul in collection1? " + collection1.contains("Ýstanbul"));

		collection1.remove("Ýstanbul");
		System.out.println("\n" + collection1.size() + " cities are in collection1 now");
		
		ArrayList<String> collection2=new ArrayList<>();
		collection2.add("Balýkesir");
		collection2.add("Ýzmir");
		collection2.add("Bursa");
		collection2.add("Trabzon");
		collection2.add("Adana");
		System.out.println("\nA list of cities in collection2: ");
		System.out.println(collection2);
		
		ArrayList<String> c1=(ArrayList<String>) collection1.clone();
		c1.addAll(collection2);
		System.out.println("\nCities in collection1 or collection2: ");
		System.out.println(c1);
		
		c1=(ArrayList<String>) collection1.clone();
		c1.retainAll(collection2);
		System.out.println("\nCities in collection1 and collection2: ");
		System.out.println(c1);
		
		c1=(ArrayList<String>) collection1.clone();
		c1.removeAll(collection2);
		System.out.println("\nCities in collection1, but not in 2: ");
		System.out.println(c1);
		
	}

}
