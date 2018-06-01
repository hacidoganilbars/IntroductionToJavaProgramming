package tr.bolum10.kredi;

//UML 
/**************************************
 *              Kredi                 *
 * -yillikFaizOrani: double           *
 * -yilSayisi: int                    *
 * -krediMiktari: double              *
 * -krediTarihi: java.util.Date       *
 *------------------------------------* 
 * +Kredi(yillikFaizOrani: double,    *
 * yilSayisi: int,krediMiktari:       *
 * double)                            *
 * +getYillikFaizOrani(): double      *
 * +setYilSayisi(                     *  
 * yilSayisi: int): void              *
 * +setKrediMiktari(                  *  
 * krediMiktari: double): void        *
 * +setYillikFaizOrani(               *
 * yillikFaizOrani: double): void     *
 * +Kredi()                           *  
 * +getYilSayisi(): int               *  
 * +getKrediMiktari(): double         *
 * +getKrediTarihi(): java.util.Date  *
 * +getAylikOdeme(): double           * 
 * +getToplamOdeme(): double          *
 **************************************/

import java.util.Date;

public class Kredi {
	private double yillikFaizOrani;
	private int yilSayisi;
	private double krediMiktari;
	private Date krediTarihi;

	Kredi() {
		this(2.5, 1, 1000);
	}

	public Kredi(double yillikFaizOrani, int yilSayisi, double krediMiktari) {
		this.yillikFaizOrani = yillikFaizOrani;
		this.yilSayisi = yilSayisi;
		this.krediMiktari = krediMiktari;
		krediTarihi = new Date();
	}

	public double getYillikFaizOrani() {
		return this.yillikFaizOrani;
	}

	public int getYilSayisi() {
		return this.yilSayisi;
	}

	public double getKrediMiktari() {
		return this.krediMiktari;
	}

	public Date getKrediTarihi() {
		return this.krediTarihi;
	}

	public void setYillikFaizOrani(double yillikFaizOrani) {
		this.yillikFaizOrani = yillikFaizOrani;
	}

	public void setYilSayisi(int yilSayisi) {
		this.yilSayisi = yilSayisi;
	}

	public void setKrediMiktari(double krediMiktari) {
		this.krediMiktari = krediMiktari;
	}

	public double getAylikOdeme() {
		double aylikFaizOrani = yillikFaizOrani / 1200;
		double aylikOdeme = krediMiktari * aylikFaizOrani / (1 - (1 / Math.pow(1 + aylikFaizOrani, yilSayisi * 12)));
		return aylikOdeme;
	}

	public double getToplamOdeme() {
		double toplamOdeme = getAylikOdeme() * yilSayisi * 12;
		return toplamOdeme;
	}

}
