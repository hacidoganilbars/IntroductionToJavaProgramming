package tr.bolum09.daire;

public class Daire {

	double yariCap;

	public Daire() {
		yariCap = 1;

	}

	public Daire(int yeniYariCap) {
		this.yariCap = yeniYariCap;
	}

	double getAlan() {
		return Math.PI * yariCap * yariCap;
	}

	double getCevre() {
		return 2 * Math.PI * yariCap;
	}

	void setYariCap(double yeniYariCap) {
		yariCap = yeniYariCap;
	}

	public double getYariCap() {
		return yariCap;
	}

}
