package tr.bolum02.egzersiz;

import java.util.Scanner;

/*
(Saglik uygulamasýi) Vucut Kitle Indeksi (BMI) (Body mask index)
Kilonuzu kilogram olarak alarak
boyunuzun(metre) karesine olarak bölün. Bunu isteyen bir program yaz
Bir pound 0.45359237 kilogram ve bir inc 0.0254 metredir.
 */
public class Cevap014 {
	public static void main(String[] args) {
		double poundKg = 0.45359237;
		double incMetre = 0.0254;

		Scanner klavye = new Scanner(System.in);
		System.out.print("Pound cinsinden agirliginizi giriniz orn=95.5: ");
		double agirlik = klavye.nextDouble();
		agirlik = agirlik * poundKg;
		System.out.println("Inc cinsinden yuksekliginizi giriniz(orn=50): ");
		double yukseklik = klavye.nextDouble();
		yukseklik = yukseklik * incMetre;

		double vucutKitleIndexi = (agirlik / Math.pow(yukseklik, 2));
		System.out.println(vucutKitleIndexi);

		klavye.close();

	}

}
