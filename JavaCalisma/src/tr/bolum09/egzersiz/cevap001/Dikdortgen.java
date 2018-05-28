package tr.bolum09.egzersiz.cevap001;

//UML Class Diagram                     
/**************************************************
*               Rectangle                         *  
* ------------------------------------------------*  
* genislik: double                                *
* yukseklik: double                               * 
* Dikdortgen()                                    *  
* Dikdortgen(yukseklik: double, genislik: double) *
* getAlan(): double                               *
* getCevre(): double                              *
***************************************************/

public class Dikdortgen {
	private double yukseklik;
	private double genislik;

	public Dikdortgen() {
		this(1, 1);
	}

	Dikdortgen(double yukseklik, double genislik) {
		this.yukseklik = yukseklik;
		this.genislik = genislik;
	}

	public double getAlan() {
		return yukseklik * genislik;
	}

	public double cevre() {
		return 2 * yukseklik * genislik;
	}

	public double getYukseklik() {
		return yukseklik;
	}

	public double getGenislik() {
		return genislik;
	}

}
