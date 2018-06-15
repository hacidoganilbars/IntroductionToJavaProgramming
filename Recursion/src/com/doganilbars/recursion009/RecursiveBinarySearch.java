package com.doganilbars.recursion009;

public class RecursiveBinarySearch {
	public static void main(String[] args) {
		int[] list = { 1, 2, 34, 5, 6 };
		int x = recursiveBinarySearch(list, 34);
		System.out.println(x);
	}

	public static int recursiveBinarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		return recursiveBinarySearch(list, key, low, high);

	}

	private static int recursiveBinarySearch(int[] list, int key, int low, int high) {
		if (low > high) {
			return -low - 1;
		}

		int mid = (low + high) / 2;
		if (key < list[mid]) {
			return recursiveBinarySearch(list, key, low, mid - 1);
		} else if (key == list[mid]) {
			return mid;
		} else {
			return recursiveBinarySearch(list, key, mid + 1, high);
		}
	}

}
