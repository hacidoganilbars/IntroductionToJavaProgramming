package tr.bolum09.egzersiz.cevap010;

public class IkinciDerecedenDenlemler {
	private double a;
	private double b;
	private double c;

	public IkinciDerecedenDenlemler(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiskriminant() {
		return Math.pow(b, 2) - 4 * a * c;
	}

	public double getBirinciKok() {
		return getDiskriminant() < 0 ? 0 : ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
	}

	public double getIkinciKok() {
		return getDiskriminant() < 0 ? 0 : ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
	}

}
