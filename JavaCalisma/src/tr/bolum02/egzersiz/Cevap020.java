package tr.bolum02.egzersiz;

import java.util.Scanner;

/*
 * (Finansal uygulama: faizi hesaplay�n) Bakiyeyi ve yillik faiz oranini biliyorsan�z
faiz = bakiye * (yillikFaizOrani / 1200)
 */
public class Cevap020 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bakiye ve faiz oranini girin (�r.% 3 i�in 3): ");
		double bakiye = klavye.nextDouble();
		double yillikFaizOrani = klavye.nextDouble();

		double faiz = bakiye * (yillikFaizOrani / 1200);

		System.out.println((int) (faiz * 100000) / 100000.0);
		klavye.close();
	}

}
