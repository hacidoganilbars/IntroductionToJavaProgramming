package tr.bolum09.egzersiz.cevap004;

import java.util.Random;

public class RandonTohumu {
	public static void main(String[] args) {

		Random rasgeleSayi = new Random(1000);

		// 0 ile 100 aras�nda ilk 50 rastgele tamsay�y� g�r�nt�ler.
		for (int i = 1; i <= 50; i++) {
			if (i % 10 == 0)
				System.out.printf("%5d\n", rasgeleSayi.nextInt(100));
			else
				System.out.printf("%5d", rasgeleSayi.nextInt(100));
		}
	}
}
