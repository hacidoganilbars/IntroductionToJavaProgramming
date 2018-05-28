package tr.bolum09.egzersiz.cevap002;

/********************************************
*               HisseSenedi                 *
*-------------------------------------------*
* sembol: String                            *
* isim: String                              *
* oncekiKapanisFiyati: double               *
* mevcutFiyat: double                       *
* generate-getter and setter                *
* HisseSenedi(sembol: String, isim: String) *
* getDegisimYuzdesi(): double               *
********************************************/
public class HisseSenedi {

	private String sembol;
	private String isim;
	private double oncekiKapanisFiyati;
	private double mevcutFiyat;

	public HisseSenedi(String sembol, String isim) {
		this.sembol = sembol;
		this.isim = isim;
	}

	public String getSembol() {
		return sembol;
	}

	public void setSembol(String sembol) {
		this.sembol = sembol;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getOncekiKapanisFiyati() {
		return oncekiKapanisFiyati;
	}

	public void setOncekiKapanisFiyati(double oncekiKapanisFiyati) {
		this.oncekiKapanisFiyati = oncekiKapanisFiyati;
	}

	public double getMevcutFiyat() {
		return mevcutFiyat;
	}

	public void setMevcutFiyat(double mevcutFiyat) {
		this.mevcutFiyat = mevcutFiyat;
	}

	public double getDegisimYuzdesi() {
		return ((mevcutFiyat - oncekiKapanisFiyati) / oncekiKapanisFiyati) * 100;
	}

}
