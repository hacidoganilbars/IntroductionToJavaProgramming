package tr.bolum09.thiss;

public class Daire {
	private double yariCap;

	public Daire() {
		this(1.0);// diger kurucuyu cagirir icine degeri koyar
	}

	public Daire(double yariCap) {
		this.yariCap = yariCap;
	}

	public static void main(String[] args) {
		Daire da = new Daire();
		System.out.println(da.yariCap);
	}

}
