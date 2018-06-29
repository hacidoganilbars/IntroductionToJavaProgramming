package com.doganilbars.setandmaps010;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<String> list = Collections.unmodifiableList(Arrays.asList("Adana", "Osmaniye"));
		// list.add("Ankara");
		System.out.println(list);
	}
}
