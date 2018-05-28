package tr.bolum09.daire;

public class DaireIslem2 {
	public static void main(String[] args) {

		// Yarı capi 1 olan daire olusturduk
		Daire daire1 = new Daire();
		System.out.println("Yarı capi: " + daire1.yariCap + " olan dairenin alanı: " + daire1.getAlan());

		// Yarı capi 25 olan daire olusturduk
		Daire daire2 = new Daire(25);
		System.out.println("Yarı capi: " + daire2.yariCap + " olan dairenin alanı: " + daire2.getAlan());

		//// Yarı capi 125 olan daire olusturduk
		Daire daire3 = new Daire(125);
		System.out.println("Yarı capi: " + daire3.yariCap + " olan dairenin alanı: " + daire3.getAlan());

		// daire2 nesnesini tekrardan tasarladik
		daire2.yariCap = 100;// veya daire2.setYariCap(100);
		System.out.println("Yarı capi: " + daire2.yariCap + " olan dairenin alanı: " + daire2.getAlan());
	}

}
