package tr.bolum05;

import java.util.Scanner;

public class OBEB {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("1.Say�y� giriniz: ");
		int sayi1 = klavye.nextInt();
		System.out.println("2.Say�y� giriniz: ");
		int sayi2 = klavye.nextInt();

		int obeb = 1;
		int bolen = 2;
		while (bolen <= sayi1 && bolen <= sayi2) {
			if (sayi1 % bolen == 0 && sayi2 % bolen == 0) {
				obeb = bolen;
			}
			bolen++;
		}
		System.out.println(sayi1 + " ve " + sayi2 + " sayilarinin obebi: " + obeb);

	}

}
