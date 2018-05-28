package tr.bolum09.daire;

public class DaireIslem2 {
	public static void main(String[] args) {

		// Yar� capi 1 olan daire olusturduk
		Daire daire1 = new Daire();
		System.out.println("Yar� capi: " + daire1.yariCap + " olan dairenin alan�: " + daire1.getAlan());

		// Yar� capi 25 olan daire olusturduk
		Daire daire2 = new Daire(25);
		System.out.println("Yar� capi: " + daire2.yariCap + " olan dairenin alan�: " + daire2.getAlan());

		//// Yar� capi 125 olan daire olusturduk
		Daire daire3 = new Daire(125);
		System.out.println("Yar� capi: " + daire3.yariCap + " olan dairenin alan�: " + daire3.getAlan());

		// daire2 nesnesini tekrardan tasarladik
		daire2.yariCap = 100;// veya daire2.setYariCap(100);
		System.out.println("Yar� capi: " + daire2.yariCap + " olan dairenin alan�: " + daire2.getAlan());
	}

}
