package com.doganilbars.recursion004;

public class Test {
	public static void main(String[] args) {
		xMethod(5);
	}

	private static void xMethod(int n) {
		if (n > 0) {
			System.out.print(n + " ");
			xMethod(n - 1);
		}
	}

}
