package tr.bolum05;

import java.util.Scanner;

public class BolenEnKucukSayi {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Bir Sayý giriniz: ");
		int n = klavye.nextInt();

		int bolen = 2;

		while (bolen <= n) {
			if (n % bolen == 0) {
				break;
			}
			bolen++;
		}
		System.out.println(n + " sayisini bolen birden buyuk en kucuk sayi: " + bolen);

		klavye.close();
	}

}
