package tr.bolum09.daire;

public class DaireIslem {
	public static void main(String[] args) {

		Daire daire = new Daire();

		double cevre = daire.getCevre();
		System.out.println(cevre);

		daire.yariCap = 5;
		cevre = daire.getCevre();
		System.out.println(cevre);

		daire.setYariCap(3);
		cevre = daire.getCevre();
		System.out.println(cevre);

	}

}
