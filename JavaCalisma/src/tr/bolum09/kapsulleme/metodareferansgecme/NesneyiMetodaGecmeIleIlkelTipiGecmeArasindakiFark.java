package tr.bolum09.kapsulleme.metodareferansgecme;

import tr.bolum09.kapsulleme.DaireDegiskenKapsulleme;

public class NesneyiMetodaGecmeIleIlkelTipiGecmeArasindakiFark {
	public static void main(String[] args) {
		// yari capi 1 olan daire olusturuldu
		DaireDegiskenKapsulleme daire = new DaireDegiskenKapsulleme(1);

		int n = 5;
		yazdirAlani(daire, n);

		System.out.println("\nYari Çap: " + daire.getYariCap());// 6.0
		System.out.println("n ise: " + n);// 5
		System.out.println("Nesne sayisi: " + DaireDegiskenKapsulleme.getNesneSayisi());
	}

	// n kere dondur ve her defasinda yaricapi 1 arttir
	public static void yazdirAlani(DaireDegiskenKapsulleme d, int n) {
		System.out.println("Yari Cap\t\tAlan");
		while (n >= 1) {
			System.out.println(d.getYariCap() + "========>\t" + d.getAlan());
			d.setYariCap(d.getYariCap() + 1);
			n--;
		}
	}
}
