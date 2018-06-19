package com.doganilbars.recursion012;

import java.util.Scanner;

public class ComputeFactorialTailRecursion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		long result = factorial(number);
		System.out.println(result);

		input.close();
	}

	public static long factorial(int number) {
		return factorial(number, 1);

	}

	private static long factorial(int number, int result) {
		if (number == 0) {
			return result;
		} else {
			return factorial(number - 1, number * result);
		}
	}
}
