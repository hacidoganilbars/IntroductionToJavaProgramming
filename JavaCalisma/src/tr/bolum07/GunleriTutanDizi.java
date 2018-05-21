package tr.bolum07;

import java.util.Scanner;

public class GunleriTutanDizi {

	public static void main(String[] args) {
		String[] gunler = { "Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar" };

		System.out.println("haftanin gununu belirlemek isin birden yediye kadar bir sayi giriniz:");
		Scanner klavye = new Scanner(System.in);
		int secim = klavye.nextInt();
		System.out.println("Sectiginiz gun: " + gunler[secim - 1]);

		switch (secim) {
		case 1:
			System.out.println("Sectiginiz gun: Pazartesi");
			break;

		default:
			System.out.println("Yanlis deger girdiniz");
			break;
		}
		klavye.close();

	}

}
