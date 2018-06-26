package com.doganilbars.collections005;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 4, 7, 10, 11, 45, 50, 59, 60, 66);
		System.out.println("(1) Index: " + Collections.binarySearch(list, 7));
		System.out.println("(2) Index: " + Collections.binarySearch(list, 9));

		List<String> list1 = Arrays.asList("blue", "green", "red");
		System.out.println("(3) Index: " + Collections.binarySearch(list1, "red"));
		System.out.println("(4) Index: " + Collections.binarySearch(list1, "cyan"));
	}
}
