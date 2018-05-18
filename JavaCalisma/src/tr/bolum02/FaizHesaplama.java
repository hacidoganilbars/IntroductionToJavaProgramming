package tr.bolum02;

import java.util.Scanner;

public class FaizHesaplama {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("Yillik faiz oranini giriniz: (Or. 4.5) ");
		double yillikFaizOrani = klavye.nextDouble();

		System.out.println("Kaç yilda odemek istiyorsunuz: (Orr. 5) ");
		int yil = klavye.nextInt();

		System.out.println("Borc alinacak miktar: (Or. 1567,98) ");
		double borcMiktari = klavye.nextDouble();

		double aylikFaizOrani = yillikFaizOrani / 1200;

		double aylikOdemeMiktari = (borcMiktari * aylikFaizOrani) / (1 - (1 / Math.pow(1 + aylikFaizOrani, yil * 12)));

		double toplamBorc = aylikOdemeMiktari * 12 * yil;

		System.out.println("Aylik Odeme miktari: " + (int) (aylikOdemeMiktari * 100) / 100.0);
		System.out.println("Toplam Odenecek miktar: " + (int) (toplamBorc * 100) / 100.0);
		klavye.close();
	}
}
