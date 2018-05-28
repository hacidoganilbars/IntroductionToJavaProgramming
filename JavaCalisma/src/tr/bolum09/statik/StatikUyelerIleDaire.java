package tr.bolum09.statik;

public class StatikUyelerIleDaire {

	double yariCap;
	// statik degisken
	static int nesnelerinSayisi = 0;

	public StatikUyelerIleDaire() {
		yariCap = 1;
		nesnelerinSayisi++;
	}

	public StatikUyelerIleDaire(double yeniYariCap) {
		yariCap = yeniYariCap;
		nesnelerinSayisi++;
	}

	// statik metod
	static int getNesnelerinSayisi() {
		return nesnelerinSayisi;
	}

	double getAlan() {
		return Math.PI * yariCap * yariCap;
	}

}
