package tr.bolum03.egzersiz;

import java.util.Scanner;

/*
 * sifir mi bir mi
 * tahmin
 * 
 */
public class Cevap014 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi = (int) (Math.random() * 2);
		System.out.println(sayi);

		System.out.print("0 mi 1 mi ?: ");
		int tahmin = klavye.nextInt();

		// System.out.println(sayi == tahmin ? "tebrikler" : "uzgunum");
		if (sayi == tahmin) {
			System.out.println("Tebrikler");
		} else {
			System.out.println("Bilemediniz");
		}
		klavye.close();
	}
}
