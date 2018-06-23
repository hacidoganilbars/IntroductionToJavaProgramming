package com.doganilbars.generic010;

public class Test1 {
	public static void main(String[] args) {

		String[] list = { "Adana", "Ankara", "Ýstanbul", "Osmaniye" };
		print1(list);
		print2(list);
	}

	public static <E> void print1(E[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}

	public static void print2(Object[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}

}
