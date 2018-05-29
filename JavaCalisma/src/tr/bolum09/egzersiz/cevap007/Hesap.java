package tr.bolum09.egzersiz.cevap007;

import java.util.Date;

public class Hesap {
	private int id;
	private double bakiye;
	private double yillikFaizOrani;
	private Date olusturmaTarihi;

	public Hesap() {
		id = 0;
		bakiye = 0.0;
		yillikFaizOrani = 0.0;
		olusturmaTarihi = new Date();
	}

	public Hesap(int id, double bakiye) {
		this.id = id;
		this.bakiye = bakiye;
		olusturmaTarihi = new Date();
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	public void setYillikFaizOrani(double yillikFaizOrani) {
		this.yillikFaizOrani = yillikFaizOrani;
	}

	public void setOlusturmaTarihi(Date olusturmaTarihi) {
		this.olusturmaTarihi = olusturmaTarihi;
	}

	public int getId() {
		return this.id;
	}

	public double getBakiye() {
		return this.bakiye;
	}

	public double getYillikFaizOrani() {
		return this.yillikFaizOrani;
	}

	public String getOlusturmaTarihi() {
		return olusturmaTarihi.toString();
	}

	public double getAylikFaizOrani() {
		return this.yillikFaizOrani / 12;
	}

	public double getAylikFaiz() {
		return this.bakiye * (getAylikFaizOrani() / 100);
	}

	public void paraCek(double miktar) {
		this.bakiye -= miktar;
	}

	public void paraYatir(double miktar) {
		this.bakiye += miktar;
	}

}
