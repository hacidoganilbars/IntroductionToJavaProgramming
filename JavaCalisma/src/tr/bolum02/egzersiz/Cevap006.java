package tr.bolum02.egzersiz;

import java.util.Scanner;

//Girilen Sayinin Rakamlarini topla
public class Cevap006 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Rakamlari toplama");
		System.out.print("0 ile 1000 (1000 haric) arasinda bir sayi giriniz: ");
		int sayi = klavye.nextInt();

		int birler = sayi % 10;// birler basamagindaki rakam degeri
		int onlar = (sayi / 10) % 10;// onlar basamagindaki rakam degeri
		int yuzler = (sayi / 100) % 10;// yuzler basamagindaki rakam degeri

		System.out.println(yuzler + onlar + birler);
		klavye.close();
	}

}
