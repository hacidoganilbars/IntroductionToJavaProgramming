package com.doganilbars.recursion004;

public class Test1 {
	public static void main(String[] args) {
		xMethod(5);
	}

	private static void xMethod(int n) {
		if (n > 0) {
			xMethod(n - 1);
			System.out.print(n + " ");
		}
	}

}
