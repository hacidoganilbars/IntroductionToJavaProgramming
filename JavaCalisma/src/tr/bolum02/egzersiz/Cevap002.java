package tr.bolum02.egzersiz;

import java.util.Scanner;

//silindirin hacmini bulmak
//yaricapi ve uzunlugu kullanici girecek
public class Cevap002 {
	public static void main(String[] args) {
		double pi = Math.PI;
		Scanner klavye = new Scanner(System.in);
		System.out.print("Silindirin yaricapini giriniz: ");
		double yariCap = klavye.nextDouble();
		System.out.print("Silindirin uzunluðunu giriniz: ");
		double uzunluk = klavye.nextDouble();

		double alan = yariCap * yariCap * pi;
		double hacim = alan * uzunluk;

		System.out.println("Silindirin hacmi: " + (hacim));

		klavye.close();

	}

}
