package tr.bolum02.egzersiz;

import java.util.Scanner;

/*
 * Tl cinsinden parayi 
 * kullanilan para birimlerine ayirmak 1 tl 50kurus 25 kurus 10 kurus 5 kurus ve 1 kurus olarak
 * 11 tane 1 tl
 * 1tane 50krs
 * 0tane 25krs
 * 0tane 10krs
 * 1tane 5krs
 * 1tane 1krs
 */
public class Cevap022 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Tam sayi olarak bir miktar para girin (ornek=11.56 için 1156): ");
		int para = klavye.nextInt();

		int birTl = para / 100;
		System.out.println(birTl + " tane 1 tl");
		para = para % 100;

		int elliKurus = para / 50;
		System.out.println(elliKurus + " tane 50 kurus");
		para = para % 50;

		int yirmiBesKurus = para / 25;
		System.out.println(yirmiBesKurus + " tane 25 kurus");
		para = para % 25;

		int onKurus = para / 10;
		System.out.println(onKurus + " tane 10 kurus");
		para = para % 10;

		int besKurus = para / 5;
		System.out.println(besKurus + " tane 5 kurus");
		para = para % 5;

		int birKurus = para;
		System.out.println(birKurus + " tane 1 kurus");

		klavye.close();

	}

}
