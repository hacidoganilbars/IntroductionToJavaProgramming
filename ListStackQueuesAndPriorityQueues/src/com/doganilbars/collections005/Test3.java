package com.doganilbars.collections005;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("yellow", "red", "green", "blue");
		Collections.reverse(list);
		System.out.println(list);
	}
}
