package tr.bolum02.egzersiz;

import java.util.Scanner;

//dakika cinsinden girilen sayi kac yil kac gun eder hesaplar
//1 yil 365 gun alinacak
public class Cevap007 {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.println("Yil ve gun cinsinden hesaplanmak istenen sayiyi dakika olarak giriniz (orn=1000000000): ");
		int dakika = klavye.nextInt();
		int saat = dakika / 60;
		int gun = saat / 24;
		int yil = gun / 365;
		int kalanGun = gun % yil;

		System.out.println(yil + " yil " + kalanGun + " gun eder");
		klavye.close();

	}
}
