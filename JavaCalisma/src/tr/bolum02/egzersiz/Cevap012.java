package tr.bolum02.egzersiz;

import java.util.Scanner;

/*minimum pist uzunlugu bulma
 * ucagin hizlanmasi yani ivmesi a
 * kalkis hizi v
 * 
 * uzunluk=v*v/2a
 */
public class Cevap012 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Uçagin hizini giriniz: ");
		double hiz = klavye.nextDouble();
		System.out.print("Ucagin ivmesini giriniz: ");
		double ivme = klavye.nextDouble();

		double uzunluk = (int) ((hiz * hiz) / (2 * ivme) * 1000) / 1000.0;

		System.out.println(uzunluk);
		klavye.close();

	}

}
