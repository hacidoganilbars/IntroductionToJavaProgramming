package tr.bolum06;

public class Test {
	public static void main(String[] args) {

		int i = 1;
		while (i <= 8) {
			method1(i, 2);
			i++;
		}
	}

	private static void method1(int i, int number) {

		for (int j = 1; j <= i; j++) {
			System.out.print(" " + number);
			number = number * 2;
		}
		System.out.println();

	}
}
