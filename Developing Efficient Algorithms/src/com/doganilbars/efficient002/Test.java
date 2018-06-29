package com.doganilbars.efficient002;

public class Test {
	public static void main(String[] args) {
		int result=0;
		int count = 1;
		while (count < 30) {
			count = count * 2;
			result++;
			// count*=2;
		}
		System.out.println(count);
		System.out.println(result);
	}

}
