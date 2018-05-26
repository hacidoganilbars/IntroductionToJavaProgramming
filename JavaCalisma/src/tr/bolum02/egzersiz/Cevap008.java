package tr.bolum02.egzersiz;

import java.util.Scanner;

public class Cevap008 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.print("Time zone offset to GMT: ");
		int offset = klavye.nextInt();

		// 1 ocak 1970'ten bugune gecen zamanin milisaniye cinsinden degeri
		long toplamMilisaniye = System.currentTimeMillis();

		// milisaniyeyi saniyeye ceviriyoruz
		long toplamSaniye = toplamMilisaniye / 1000;

		// artan saniyeyi hesaplýyoruz
		long artanSaniye = toplamSaniye % 60;

		// toplam dakika
		long toplamDakika = toplamSaniye / 60;

		// artan dakika
		long artanDakika = toplamDakika % 60;

		// toplam saat
		long toplamSaat = toplamDakika / 60;

		// artan saat
		long artanSaat = toplamSaat % 24;
		artanSaat = artanSaat + offset;

		// sonuc
		System.out.println("Current time is " + artanSaat + ":" + artanDakika + ":" + artanSaniye);

		klavye.close();
	}

}
