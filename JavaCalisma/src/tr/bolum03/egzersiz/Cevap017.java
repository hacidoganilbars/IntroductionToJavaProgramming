package tr.bolum03.egzersiz;

import java.util.Scanner;

/*
 * Tas makas kagit oyunu
 */
public class Cevap017 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int rasgele = (int) (Math.random() * 3);

		System.out.print("0 = Taþ  1 = Kagit  2 = Makas: ");
		int tahmin = klavye.nextInt();
		String tahminRandom = "";
		if (rasgele == 0) {
			tahminRandom = "Tas";
		}
		if (rasgele == 1) {
			tahminRandom = "Kagit";
		}
		if (rasgele == 2) {
			tahminRandom = "Makas";
		}

		String tahminKullanici = "";
		if (tahmin == 0) {
			tahminKullanici = "Tas";
		}
		if (tahmin == 1) {
			tahminKullanici = "Kagit";
		}
		if (tahmin == 2) {
			tahminKullanici = "Makas";
		}

		if (rasgele == tahmin) {
			System.out.println("Berabere");
		} else {
			boolean kazandin = (tahmin == 0 && rasgele == 2) || (tahmin == 1 && rasgele == 0)
					|| (tahmin == 2 && rasgele == 1);
			if (kazandin == true) {
				System.out.println(tahminKullanici + " Bravo sen kazandýn bilgisayar " + tahminRandom + " secmisti");
			} else {
				System.out
						.println(tahminKullanici + " seçtin bilgisayar kazandi bilgisayar bunu secti " + tahminRandom);
			}
		}
		klavye.close();
	}

}
