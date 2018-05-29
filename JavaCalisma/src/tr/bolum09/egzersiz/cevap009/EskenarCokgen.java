package tr.bolum09.egzersiz.cevap009;

public class EskenarCokgen {
	private int kenarSayisi;
	private double kenar;
	private double x;
	private double y;

	public EskenarCokgen() {
		kenarSayisi = 3;
		kenar = 1;
		x = 0;
		y = 0;
	}

	public EskenarCokgen(int kenarSayisi, double kenar) {
		this.kenarSayisi = kenarSayisi;
		this.kenar = kenar;
		x = 0;
		y = 0;
	}

	public EskenarCokgen(int kenarSayisi, double kenar, double x, double y) {
		this.kenarSayisi = kenarSayisi;
		this.kenar = kenar;
		this.x = x;
		this.y = y;
	}

	public int getKenarSayisi() {
		return kenarSayisi;
	}

	public void setKenarSayisi(int kenarSayisi) {
		this.kenarSayisi = kenarSayisi;
	}

	public double getKenar() {
		return kenar;
	}

	public void setKenar(double kenar) {
		this.kenar = kenar;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getCevre() {
		return kenar * kenarSayisi;
	}

	public double getAlan() {
		return (kenarSayisi * Math.pow(kenar, 2)) / (4 * Math.tan(Math.PI / kenarSayisi));
	}

}
