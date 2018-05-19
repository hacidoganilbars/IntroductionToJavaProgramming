package tr.bolum05;

import java.util.Scanner;

public class OBEBFor {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("1.Sayýyý giriniz: ");
		int sayi1 = klavye.nextInt();
		System.out.println("2.Sayýyý giriniz: ");
		int sayi2 = klavye.nextInt();

		int obeb = 1;
		for (int bolen = 2; bolen <= sayi1 && bolen <= sayi2; bolen++) {
			if (sayi1 % bolen == 0 && sayi2 % bolen == 0) {
				obeb = bolen;
			}

		}
		System.out.println(sayi1 + " ve " + sayi2 + " sayilarinin obebi: " + obeb);

		klavye.close();

	}

}
