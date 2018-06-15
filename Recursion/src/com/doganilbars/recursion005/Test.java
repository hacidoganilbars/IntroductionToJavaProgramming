package com.doganilbars.recursion005;

public class Test {
	public static void main(String[] args) {
		xMethod(1234567);
	}

	private static void xMethod(int n) {
		if(n!=0) {
			System.out.print(n);
			xMethod(n/10);
		}
		
	}

}
