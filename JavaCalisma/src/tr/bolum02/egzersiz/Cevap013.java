package tr.bolum02.egzersiz;

import java.util.Scanner;

//finansal uygulama
/*
(Finansal uygulama: bilesik faiz) Her ay 100 tl tasarruf yaptiginizi varsayalim
Yillik faiz oraný% 5 ile bir tasarruf hesabina. Boylece aylik faiz
orani 0,05 / 12 = 0,00417'dir. 
Ilk aydan sonra hesaptaki deger=100 * (1 + 0,00417) = 100,417 
Ikinci aydan sonra hesaptaki deger=(100 + 100,417) * (1 + 0,00417) = 201,252
Ucuncu aydan sonra, hesaptaki deger=(100 + 201,252) * (1 + 0,00417) = 302,507
ve bunun gibi.
  6. aydan sonraki deðeri bulan program
 */
public class Cevap013 {
	public static void main(String[] args) {
		double aylikFaizOrani = 0.00417;
		Scanner klavye = new Scanner(System.in);
		System.out.print("Aylik tasarruf tutarini girin(orn=100): ");
		double aylikTasarruf = klavye.nextDouble();

		double toplam = aylikTasarruf * (1 + aylikFaizOrani);
		toplam = (aylikTasarruf + toplam) * (1 + aylikFaizOrani);
		toplam = (aylikTasarruf + toplam) * (1 + aylikFaizOrani);
		toplam = (aylikTasarruf + toplam) * (1 + aylikFaizOrani);
		toplam = (aylikTasarruf + toplam) * (1 + aylikFaizOrani);
		toplam = (aylikTasarruf + toplam) * (1 + aylikFaizOrani);
		System.out.println("Altý ay sonra hesaptaki tutar: " + ((int) (toplam * 100) / 100.0));

		klavye.close();

	}
}
