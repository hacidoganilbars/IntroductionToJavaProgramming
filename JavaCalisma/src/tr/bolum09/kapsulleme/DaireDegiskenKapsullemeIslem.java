package tr.bolum09.kapsulleme;

public class DaireDegiskenKapsullemeIslem {
	public static void main(String[] args) {

		// yari capi 5.0 olan bir daire
		DaireDegiskenKapsulleme benimDairem = new DaireDegiskenKapsulleme(5.0);
		System.out.println("Yari capi: " + benimDairem.getYariCap() + " olan dairenin alani: " + benimDairem.getAlan());

		// benim dairemin yaricapini yuzde 10 arttir
		benimDairem.setYariCap(benimDairem.getYariCap() * 1.1);
		System.out.println("Yari capi: " + benimDairem.getYariCap() + " olan dairenin alani: " + benimDairem.getAlan());

		System.out.println("Olusturulan nesne sayisi: " + DaireDegiskenKapsulleme.getNesneSayisi());

	}

}
