package tr.bolum03.egzersiz;

import java.util.Scanner;

/*
 * Saglik uygulamasi
Kullanicinin agirlik icin feet ve uzunluk icinse inc girmesine izin verin.
Ornegin, bir kisi 5 feet ve 10 inc
not:
KILOGRAMS_PER_POUND = 0.45359237
METERS_PER_INCH = 0.0254
FEET_PER_INCH = 0.0833333
 */
public class Cevap006 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Agirligi pound cinsinden giriniz: ");
		double agirlik = klavye.nextDouble();
		System.out.print("Feet giriniz: ");
		double feet = klavye.nextDouble();
		System.out.print("Inc giriniz: ");
		double inc = klavye.nextDouble();

		double poundKiloya = 0.45359237;
		double incMetreye = 0.0254;
		double incFeete = 0.0833333;

		agirlik *= poundKiloya;
		double uzunluk = (inc += feet / incFeete) * incMetreye;
		double bmi = agirlik / Math.pow(uzunluk, 2);
		// Display result
		System.out.println("BMI " + bmi + " dir");
		if (bmi < 18.5) {
			System.out.println("Normalden Hafif");
		}

		else if (bmi < 25) {
			System.out.println("Normal");
		}

		else if (bmi < 30) {
			System.out.println("Kilolu");
		}

		else {
			System.out.println("Obezite");
		}

		klavye.close();
	}
}
