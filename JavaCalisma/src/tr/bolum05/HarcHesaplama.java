package tr.bolum05;

public class HarcHesaplama {
	public static void main(String[] args) {
		double harc = 10_000;
		int yil = 1;
		while (harc <= 20_000) {
			harc *= 1.07;
			yil++;
		}
		System.out.printf(yil + " yýl sonra harc: %.2f", harc);
	}

}
