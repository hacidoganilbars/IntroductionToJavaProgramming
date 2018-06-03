package tr.bolum11.binding.test0;

public class Test {
	public static void main(String[] args) {
		Integer[] list1 = { 12, 24, 55, 1 };
		Double[] list2 = { 12.4, 24.0, 55.2, 1.0 };
		// int[] list3 = { 1, 2, 3 };
		printArray(list1);
		printArray(list2);
		// ilkel tipler obje degildir
		// printArray(list3);

	}

	private static void printArray(Object[] list) {
		for (Object object : list) {
			System.out.print(object + " ");
		}
		System.out.println();

	}

}
