package tr.bolum09.kapsulleme.metodareferansgecme;

import tr.bolum09.kapsulleme.DaireDegiskenKapsulleme;

public class NesneyiMetodaGecmekIslem {
	public static void main(String[] args) {
		DaireDegiskenKapsulleme daire = new DaireDegiskenKapsulleme(3.5);
		// daire nesne referansi metoda gecirilir
		daireYazdir(daire);
	}

	public static void daireYazdir(DaireDegiskenKapsulleme daire) {
		System.out.println("Yari capi: " + daire.getYariCap() + " olan dairenin alani: " + daire.getAlan() + " dir");
	}

}
