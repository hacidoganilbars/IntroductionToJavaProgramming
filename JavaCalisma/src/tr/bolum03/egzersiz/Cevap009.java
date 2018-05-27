package tr.bolum03.egzersiz;

import java.util.Scanner;

/*
 * (ISBN-10'u kontrol et) ISBN-10 (Uluslararasi Standart Kitap Numarasi)
10 haneden olusur: d1d2d3d4d5d6d7d8d9d10. Son rakam, d10, bir saglama toplamidir.
Asagidaki formul kullanilarak diger dokuz basamaktan hesaplanýr:
(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)% 11
Saglama toplami 10 ise, son rakami ISBN-10'a göre X olarak belirtilir.
Kullanicinin ilk 9 haneye girmesini isteyen bir program yazip
10 basamaklý ISBN'yi (baþtaki sýfýrlar dahil) görüntüler.
 */
public class Cevap009 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir ISBN’nin ilk 9 basamagini tamsayi olarak girin: ");
		int d1 = klavye.nextInt();
		int d2 = klavye.nextInt();
		int d3 = klavye.nextInt();
		int d4 = klavye.nextInt();
		int d5 = klavye.nextInt();
		int d6 = klavye.nextInt();
		int d7 = klavye.nextInt();
		int d8 = klavye.nextInt();
		int d9 = klavye.nextInt();

		int d10 = ((d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11);
		if (d10 == 10) {
			System.out.println("ISBN10 NUMARASI " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + ""
					+ d8 + "" + d9 + "X");
		} else {
			System.out.println("ISBN10 NUMARASI " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + ""
					+ d8 + "" + d9 + "" + d10);
		}

		klavye.close();

	}

}
