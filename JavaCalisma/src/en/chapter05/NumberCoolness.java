package en.chapter05;

public class NumberCoolness {

	public static void main(String[] args) {

		int satirSayisi = 9;

		birinciYontem(satirSayisi);

		System.out.println("------------------------------------");

		ikinciYontem(satirSayisi);
	}

	private static void ikinciYontem(int satirSayisi) {
		int sayi = 0;
		for (int i = 1; i <= satirSayisi; i++) {
			for (int j = 0; j < satirSayisi - i; j++) {
				System.out.print(" ");
			}
			sayi = sayi * 10 + i;
			System.out.println(sayi + " x 8 " + i + " = " + (sayi * 8 + i));

		}
	}

	private static void birinciYontem(int satirSayisi) {
		for (int i = 1; i <= satirSayisi; i++) {

			for (int j = 0; j < satirSayisi - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.print(" x 8 " + i + " = ");

			for (int j = 9; j > 9 - i; j--) {
				System.out.print(j);
			}

			// int sayi = 9;
			// for (int j = 0; j < i; j++) {
			// System.out.print(sayi);
			// sayi--;
			// }
			System.out.println();
		}
	}

}
