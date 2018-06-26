package com.doganilbars.collections005;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Test9 {
	public static void main(String[] args) {
		Collection<String> collection = Arrays.asList("red", "green", "blue");
		System.out.println(Collections.max(collection));
		System.out.println(Collections.min(collection));

		Collection<String> collection1 = Arrays.asList("red", "cyan");
		Collection<String> collection2 = Arrays.asList("red", "blue");
		Collection<String> collection3 = Arrays.asList("pink", "tan");
		System.out.println(Collections.disjoint(collection1, collection2));
		System.out.println(Collections.disjoint(collection1, collection3));

		Collection<String> collection4 = Arrays.asList("red", "cyan", "red");
		System.out.println(Collections.frequency(collection4, "red"));
	}

}
