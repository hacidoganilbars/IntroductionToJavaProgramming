package tr.bolum09.egzersiz.cevap006;

public class KronometreIslem {
	public static void main(String[] args) {
		Kronometre kronometre = new Kronometre();

		int[] rasgeleDizi = getDizi();
		kronometre.baslat();
		secimSiralamasi(rasgeleDizi);
		kronometre.dur();
		System.out.println("100000'e kadar rasgele sayilari uretip siralarken gecen zaman: " + kronometre.getGecenSure()
				+ " milliseconds");
	}

	public static int[] getDizi() {
		int[] array = new int[100000];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100000);
		}
		return array;
	}

	public static void secimSiralamasi(int[] rasgeleDizi) {
		for (int i = 0; i < rasgeleDizi.length - 1; i++) {
			int min = rasgeleDizi[i];
			int minIndex = i;

			for (int j = i + 1; j < rasgeleDizi.length; j++) {
				if (rasgeleDizi[j] < min) {
					min = rasgeleDizi[j];
					minIndex = j;
				}
			}

			if (i != minIndex) {
				rasgeleDizi[minIndex] = rasgeleDizi[i];
				rasgeleDizi[i] = min;
			}

		}

	}

}
