package tr.bolum09.kapsulleme;

public class DaireDegiskenKapsulleme {
	private double yariCap = 1;
	private static int nesneSayisi;

	public DaireDegiskenKapsulleme() {
		nesneSayisi++;
	}

	public DaireDegiskenKapsulleme(double yeniYariCap) {
		yariCap = yeniYariCap;
		nesneSayisi++;
	}

	// nesnenin isaret ettigi yari capi gosterir
	public double getYariCap() {
		return yariCap;
	}

	// yeni yaricapi ayarlar yaricap negatif girilirse yaricap sifir ayarlanir
	public void setYariCap(double yeniYariCap) {
		this.yariCap = (yeniYariCap >= 0) ? yeniYariCap : 0;
	}

	public static int getNesneSayisi() {
		return nesneSayisi;
	}

	public double getAlan() {
		return Math.PI * yariCap * yariCap;
	}

}
