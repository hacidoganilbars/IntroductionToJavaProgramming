package tr.bolum09.egzersiz.cevap013;

import java.util.Scanner;

public class KonumIslem {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Dizideki satir ve sutun sayilarini giriniz: ");
		int satirlar = klavye.nextInt();
		int sutunlar = klavye.nextInt();

		double[][] array = new double[satirlar][sutunlar];
		System.out.println("Enter the array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = klavye.nextDouble();
			}
		}

		Konum buyuk = enBuyukunYeri(array);

		System.out.println("Konumdaki en yuksek deger " + buyuk.yuksekDeger + " burada (" + buyuk.satir + ", "
				+ buyuk.sutun + ")");
		klavye.close();
	}

	public static Konum enBuyukunYeri(double[][] array) {
		return new Konum(array);
	}
}
