package tr.bolum03.egzersiz;

import java.util.Scanner;

public class Cevap007 {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.print("Parasal miktari girin, ornek 11,56: ");
		double miktar = klavye.nextDouble();

		int kalanMiktar = (int) (miktar * 100);

		int dolarSayisi = kalanMiktar / 100;
		kalanMiktar %= 100;

		int yirmiBesSentSayisi = kalanMiktar / 25;
		kalanMiktar %= 25;

		int onSentSayisi = kalanMiktar / 10;
		kalanMiktar %= 10;

		int besSentSayisi = kalanMiktar / 5;
		kalanMiktar %= 5;

		int birSentSayisi = kalanMiktar;

		System.out.println("Miktar " + miktar);
		System.out.println(dolarSayisi + (dolarSayisi == 1 ? " dollar" : " dollars"));
		System.out.println(yirmiBesSentSayisi + (yirmiBesSentSayisi == 1 ? " quarter" : " quarters"));
		System.out.println(onSentSayisi + (onSentSayisi == 1 ? " dime" : " dimes"));
		System.out.println(besSentSayisi + (besSentSayisi == 1 ? " nickel" : " nickels"));
		System.out.println(birSentSayisi + (birSentSayisi == 1 ? " pennie" : " pennies"));
		System.out.println("icerir");

		klavye.close();
	}

}
