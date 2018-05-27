package tr.bolum03.egzersiz;

import java.util.Scanner;

/*
 * Lotery oyunu
 * 3 basamakli bir sayiyi
 * tahmin etme bilinen rakamlara gore para 
 * kazanma 
 * 
 */
public class Cevap015 {
	public static void main(String[] args) {

		int sayi = 100 + (int) (Math.random() * 900);

		// System.out.println(sayi);

		Scanner klavye = new Scanner(System.in);
		System.out.print("Uc rakam girin: ");
		int rakam1 = klavye.nextInt();
		int rakam2 = klavye.nextInt();
		int rakam3 = klavye.nextInt();

		int temp = sayi;

		int birler = sayi % 10;

		sayi = sayi / 10;
		int onlar = sayi % 10;

		sayi = sayi / 10;
		int yuzler = sayi;

		int sayac = 0;
		if (rakam1 == birler || rakam1 == onlar || rakam1 == yuzler) {
			System.out.println("ilk rakam sayida var");
			sayac++;
		}
		if (rakam2 == birler || rakam2 == onlar || rakam2 == yuzler) {
			System.out.println("ikinci rakam sayida var");
			sayac++;
		}
		if (rakam3 == birler || rakam3 == onlar || rakam3 == yuzler) {
			System.out.println("üçüncü rakam sayida var");
			sayac++;
		}

		if (sayac == 1) {
			System.out.println("1 000 tl kazandýnýz");
		}
		if (sayac == 2) {
			System.out.println("3 000 tl kazandýnýz");
		}
		if (sayac == 3) {
			System.out.println("20 000 tl kazandýnýz");
		} else {
			System.out.println("Kazanc yok");
		}
		System.out.println("sayý= " + temp);

		klavye.close();

	}

}
