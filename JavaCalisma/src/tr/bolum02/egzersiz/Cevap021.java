package tr.bolum02.egzersiz;

import java.util.Scanner;

/*
 * (Finansal uygulama: gelecekteki yatirim degerini hesaplayin)
Yatirim tutarini, yillik faiz oranini ve yil sayýsýný biliyorsaniz
Asagidaki formulu kullanarak gelecekteki yatirim degerini hesaplayabiliriz:
gelecektekiYatirimDegeri =
yatirimTutari * (1 + aylikFaizOrani)^yil * 12
Ornegin, tutari 1000, yillik faiz oraný% 3.25, yili
1 yil girerseniz, gelecekteki yatirim degeri 1032.98'dir.

 */
public class Cevap021 {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.print("Yatirim tutarini giriniz: ");
		double yatirimTutari = klavye.nextDouble();

		System.out.print("yillik faiz oranini yuzde cinsinden giriniz: ");
		double aylikFaizOrani = klavye.nextDouble();
		aylikFaizOrani = aylikFaizOrani / 1200; // girilen yillik faiz biz onu aylik faize cevirmeliyiz
		// aylikFaizOrani/=1200

		System.out.print("yil sayisini giriniz: ");
		double yil = klavye.nextDouble();

		double gelecektekiYatirimDegeri = yatirimTutari * Math.pow((1 + aylikFaizOrani), yil * 12);
		System.out.println("Birikmis Deger= " + (int) (gelecektekiYatirimDegeri * 100) / 100.0);
		klavye.close();
	}

}
