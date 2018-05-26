package tr.bolum02.egzersiz;

import java.util.Scanner;

/*
 * Sicaklik ve ruzgar hizini kullanarak soguklugu olcmek
 * Formul 2 mph'nin altindaki ruzgar hizlari veya -58 ºF'nin altýndaki sicakliklarda kullanilamaz.
 * twc ruzgar sogutma sicakligi
 * twc = 35,74 + 0,6215ta - 35,75*v ^ 0,16 + 0,4275ta*v^0,16
 */
public class Cevap017 {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.print("Fahrenheit'te sýcaklýðý -58 ° F ile 41 ° F arasýnda giriniz: ");
		double sicaklik = klavye.nextDouble();
		System.out.print("Ruzgar hizini 2mph veya daha yuksek giriniz: ");
		double ruzgarHizi = klavye.nextDouble();

		double twc = 35.74 + 0.6215 * sicaklik - 35.75 * Math.pow(ruzgarHizi, 0.16)
				+ 0.4275 * sicaklik * Math.pow(ruzgarHizi, 0.16);
		System.out.println("Ruzgar soguklugu endeksi: " + (int)(twc*100000)/100000.0);
		klavye.close();

	}

}
