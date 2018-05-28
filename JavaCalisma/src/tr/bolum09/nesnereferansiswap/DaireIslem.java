package tr.bolum09.nesnereferansiswap;

public class DaireIslem {
	public static void main(String[] args) {
		Daire daire1 = new Daire(1);
		Daire daire2 = new Daire(2);

		swap1(daire1, daire2);
		System.out.println("swap1 metodundan sonra daire1: " + daire1.yariCap + " daire2: " + daire2.yariCap);

		swap2(daire1, daire2);
		System.out.println("swap2 metodundan sonra daire1: " + daire1.yariCap + " daire2: " + daire2.yariCap);
	}

	public static void swap1(Daire x, Daire y) {
		Daire temp = x;
		x = y;
		y = temp;
	}

	public static void swap2(Daire x, Daire y) {
		double temp = x.yariCap;
		x.yariCap = y.yariCap;
		y.yariCap = temp;
	}
}
