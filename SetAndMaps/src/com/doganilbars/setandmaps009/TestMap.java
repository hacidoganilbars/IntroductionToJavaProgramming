package com.doganilbars.setandmaps009;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Hacı", 30);
		hashMap.put("Doğan", 31);
		hashMap.put("İlbars", 29);
		hashMap.put("Mahmut", 29);

		System.out.println("Display entries in HashMap");
		System.out.println(hashMap + "\n");

		Map<String, Integer> treeMap = new TreeMap<>(hashMap);
		System.out.println("Display entires in asceding order of key ");
		System.out.println(treeMap);

		Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
		linkedHashMap.put("Hacı", 30);
		linkedHashMap.put("Doğan", 31);
		linkedHashMap.put("İlbars", 29);
		linkedHashMap.put("Mahmut", 29);
		System.out.println("\nThe age for İlbars is " + linkedHashMap.get("İlbars"));
		System.out.println("Display entries in LinkedHashMap ");
		System.out.println(linkedHashMap);

	}
}
