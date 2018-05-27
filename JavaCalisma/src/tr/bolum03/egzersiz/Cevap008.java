package tr.bolum03.egzersiz;

import java.util.Scanner;

/*
 * Girilen 3 tane tam sayiyi siralamak icin swap kullanilabilir
 */
public class Cevap008 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Uc(3) tane tamsayi giriniz ");
		int sayi1 = klavye.nextInt();
		int sayi2 = klavye.nextInt();
		int sayi3 = klavye.nextInt();
		int temp;
		/*
		 * kucukten buyuge dogru siraladigimiz icin siralamada yer degismesi
		 * gerekebilecek sayilari kontrol ediyoruz. Dikkat edecek olursak sayi1 sayi2den
		 * veya sayi3 ten buyukse kosul icine girer ve icerde sayi1'i sayi2 ve sayi3 ile
		 * ayri ayri kýyaslamaliyiz. Dogru olan ifadelere girer ve gereken islemler
		 * yapilir.
		 */
		if (sayi2 < sayi1 || sayi1 > sayi3) {
			if (sayi1 > sayi2) {
				temp = sayi1;
				sayi1 = sayi2;
				sayi2 = temp;
			}
			if (sayi1 > sayi3) {
				temp = sayi1;
				sayi1 = sayi3;
				sayi3 = temp;
			}
		}
		/*
		 * sayi1 en kucukse veya en buyukse sayi2 ve sayi3'un yerini kontrol etmeliyiz
		 * sayi2 buyukse sayi3ten bu ikisi yer degistirmelidir.
		 */
		if (sayi2 > sayi3) {
			temp = sayi2;
			sayi2 = sayi3;
			sayi3 = temp;
		}
		System.out.println(sayi1 + " " + sayi2 + " " + sayi3);

		klavye.close();

	}
}
