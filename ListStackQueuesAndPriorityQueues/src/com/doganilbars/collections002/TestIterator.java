package com.doganilbars.collections002;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		Collection<String> collection=new ArrayList<>();
		collection.add("Adana");
		collection.add("Osmaniye");
		collection.add("Ýstanbul");
		collection.add("Balýkesir");
		collection.add("Ýzmir");
		collection.add("Manisa");
		
		for (String string : collection) {
			System.out.print(string.toUpperCase()+" ");
		}System.out.println();
		
		Iterator<String> iterator=collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase()+" ");
		}
		System.out.println();
	}

}
