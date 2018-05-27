package tr.bolum03.egzersiz;

import java.util.Scanner;

public class Cevap013 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.print(
				"(0-tek filtre, 1-birlikte evli veya nitelikli dul, 2-ayri evli, 3-ev sahibi) Dosyalama durumunu giriniz: ");
		int durum = klavye.nextInt();

		System.out.print("Enter the taxable income: ");
		double gelir = klavye.nextDouble();

		double vergi = 0;
		switch (durum) {
		case 0:
			vergi += (gelir <= 8350) ? gelir * 0.10 : 8350 * 0.10;
			if (gelir > 8350)
				vergi += (gelir <= 33950) ? (gelir - 8350) * 0.15 : 25600 * 0.15;
			if (gelir > 33950)
				vergi += (gelir <= 82250) ? (gelir - 33950) * 0.25 : 48300 * 0.25;
			if (gelir > 82250)
				vergi += (gelir <= 171550) ? (gelir - 82250) * 0.28 : 89300 * 0.28;
			if (gelir > 171550)
				vergi += (gelir <= 372950) ? (gelir - 171550) * 0.33 : 201400 * 0.33;
			if (gelir > 372950)
				vergi += (gelir - 372950) * 0.35;
			break;
		case 1:
			vergi += (gelir <= 16700) ? gelir * 0.10 : 16700 * 0.10;
			if (gelir > 16700)
				vergi += (gelir <= 67900) ? (gelir - 16700) * 0.15 : (67900 - 16700) * 0.15;
			if (gelir > 67900)
				vergi += (gelir <= 137050) ? (gelir - 67900) * 0.25 : (137050 - 67900) * 0.25;
			if (gelir > 137050)
				vergi += (gelir <= 208850) ? (gelir - 137050) * 0.28 : (208850 - 137050) * 0.28;
			if (gelir > 208850)
				vergi += (gelir <= 372950) ? (gelir - 208850) * 0.33 : (372950 - 208850) * 0.33;
			if (gelir > 372950)
				vergi += (gelir - 372950) * 0.35;
			break;
		case 2:
			vergi += (gelir <= 8350) ? gelir * 0.10 : 8350 * 0.10;
			if (gelir > 8350)
				vergi += (gelir <= 33950) ? (gelir - 8350) * 0.15 : (33950 - 8350) * 0.15;
			if (gelir > 33950)
				vergi += (gelir <= 68525) ? (gelir - 33950) * 0.25 : (68525 - 33950) * 0.25;
			if (gelir > 68525)
				vergi += (gelir <= 104425) ? (gelir - 68525) * 0.28 : (104425 - 68525) * 0.28;
			if (gelir > 104425)
				vergi += (gelir <= 186475) ? (gelir - 104425) * 0.33 : (186475 - 104425) * 0.33;
			if (gelir > 186475)
				vergi += (gelir - 186475) * 0.35;
			break;
		case 3:
			vergi += (gelir <= 11950) ? gelir * 0.10 : 11950 * 0.10;
			if (gelir > 11950)
				vergi += (gelir <= 45500) ? (gelir - 11950) * 0.15 : (45500 - 11950) * 0.15;
			if (gelir > 45500)
				vergi += (gelir <= 117450) ? (gelir - 45500) * 0.25 : (117450 - 45500) * 0.25;
			if (gelir > 117450)
				vergi += (gelir <= 190200) ? (gelir - 117450) * 0.28 : (190200 - 117450) * 0.28;
			if (gelir > 190200)
				vergi += (gelir <= 372950) ? (gelir - 190200) * 0.33 : (372950 - 190200) * 0.33;
			if (gelir > 372950)
				vergi += (gelir - 372950) * 0.35;
			break;
		default:
			System.out.println("Hata gecersiz durum");
			System.exit(1);
		}

		System.out.println("Vergi miktari " + (int) (vergi * 100) / 100.0);

		klavye.close();

	}
}
