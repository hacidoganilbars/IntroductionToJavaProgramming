package tr.bolum03.egzersiz;

import java.util.Scanner;

/*
 * (Cebir: ikinci dereceden denklemleri cozer)
 * ax*x + bx + c = 0 
 * Ikinci dereceden bir denklemin iki koku
 * asagidaki formul kullanilarak elde edilebilir:
 * r1 = (-b + kok(b*b - 4ac))/2a
 * r2 =(-b - kok(b*b - 4ac))/2a
 * b*b - 4ac kuadratik denklemin diskriminanti olarak adlandirilir. Pozitif ise,
 * denklemin iki gercel koku vardir. Eger sifir(0) ise, denklemin bir kökü vardýr. Eger negatif ise
 * denklemin gercel kokleri yoktur.
 * kok x hesaplamak için Math.pow (x, 0.5) kullanabileceginizi unutmayin. 
 */
public class Cevap001 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("ax*x + bx + c ifadesi icin a: ");
		double a = klavye.nextDouble();

		System.out.print(a + "x*x + bx + c ifadesi icin b: ");
		double b = klavye.nextDouble();
		System.out.print(a + "x*x + " + b + "x + c ifadesi icin c: ");
		double c = klavye.nextDouble();
		System.out.print(a + "x*x + " + b + "x + " + c);

		double diskriminant = b * b - 4 * a * c;

		double kok1 = (-b + Math.pow(diskriminant, 0.5)) / (2 * a);
		double kok2 = (-b - Math.pow(diskriminant, 0.5)) / (2 * a);
		if (diskriminant > 0) {
			System.out.println("Denklemin iki koku vardir: " + (int) (kok1 * 1000000) / 1000000.0 + " "
					+ (int) (kok2 * 1000000) / 1000000.0);
		} else if (diskriminant == 0) {
			System.out.println("Denklemin tek koku vardir yani iki kokuda esittir: "
					+ (int) (kok1 * 1000000) / 1000000.0 + " " + (int) (kok2 * 1000000) / 1000000.0);
		} else {
			System.out.println("Denklemin gercel koku yoktur: " + kok1 + " " + kok2);// NaN
		}

		klavye.close();
	}

}
