package tr.bolum02.egzersiz;

import java.util.Scanner;

//mali uygulama
//Girilen degerin faiziyle birlikte hesaplanmasi
public class Cevap005 {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.print("Ana para miktarýný giriniz (Orn=10): ");
		double anaPara = klavye.nextDouble();

		System.out.print("Faiz oranini yuzde olarak giriniz(Orn=15):");
		double faizOrani = klavye.nextDouble();

		double faizYuzde = faizOrani / 100;

		double faiziyleBirlikteToplamPara = anaPara + anaPara * faizYuzde;
		System.out.println(faiziyleBirlikteToplamPara);

		klavye.close();
	}

}
