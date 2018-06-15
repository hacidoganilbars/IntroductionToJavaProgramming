package com.doganilbars.recursion008;

public class RecursiveSelectionSort {

	public static void sort(double[] list) {
		sort(list, 0, list.length - 1);
	}

	private static void sort(double[] list, int low, int high) {
		if (low < high) {
			int indexOfMin = low;
			double min = list[low];
			for (int i = low + 1; i <= high; i++) {
				if (list[i] < min) {
					min = list[i];
					indexOfMin = i;
				}
			}
			list[indexOfMin] = list[low];
			list[low] = min;
			sort(list, low + 1, high);
		}
	}
	
	public static void main(String[] args) {
		double[] list= {12.3,4.2,13.1,13.5,2.6};
		for (double i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		sort(list);
		for (double i : list) {
			System.out.print(i+" ");
		}
	}
}
