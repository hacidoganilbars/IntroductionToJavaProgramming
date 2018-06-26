package com.doganilbars.collections005;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test6 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("yellow", "red", "green", "blue");
		List<String> list2 = Arrays.asList("white", "black");
		Collections.copy(list1, list2);
		System.out.println(list1);
	}
}
