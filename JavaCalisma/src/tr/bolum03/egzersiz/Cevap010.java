package tr.bolum03.egzersiz;

import java.util.Scanner;

/*
 * iki sayi arasindaki farki bilmece
 */
public class Cevap010 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi1 = (int) (Math.random() * 100);
		int sayi2 = (int) (Math.random() * 100);
		int fark;
		int temp;
		if (sayi2 > sayi1) {
			temp = sayi2;
			sayi2 = sayi1;
			sayi1 = temp;
		}
		fark = sayi1 - sayi2;
		System.out.println(sayi1 + " - " + sayi2 + " = ?");
		int cevap = klavye.nextInt();
		if (fark == cevap) {
			System.out.println("Dogru Bildiniz!! " + sayi1 + " - " + sayi2 + " = " + fark);
		} else {
			System.out.println("Yanlis cevap dogrusu " + fark + " olmaliydi");
		}

		klavye.close();

	}

}
