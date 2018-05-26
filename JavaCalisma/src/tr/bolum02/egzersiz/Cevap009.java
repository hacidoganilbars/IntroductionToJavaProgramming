package tr.bolum02.egzersiz;

import java.util.Scanner;

//ivme hesaplayan program a=(V1-V0)/t
public class Cevap009 {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.print("Ýlk hizini giriniz: ");
		double ilkHiz = klavye.nextDouble();

		System.out.print("Son hizini giriniz: ");
		double sonHiz = klavye.nextDouble();

		System.out.print("gecen sureyi giriniz: ");
		double gecenSure = klavye.nextDouble();

		double ivme = (sonHiz - ilkHiz) / gecenSure;
		System.out.println((int) (ivme * 100) / 100.0);
		klavye.close();
	}
}
