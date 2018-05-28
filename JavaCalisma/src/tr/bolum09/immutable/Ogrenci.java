package tr.bolum09.immutable;

import java.util.Date;

/*
 * Hicbir set metodu olmadigi halde Ogrenci Sinifi immutable
 * degildir OgrenciIslem sinifinda gorebilirsiniz
 */
public class Ogrenci {
	private int id;
	private String isim;
	private Date kayitTarihi;

	public Ogrenci(int no, String yeniIsim) {
		id = no;
		isim = yeniIsim;
		kayitTarihi = new Date();
	}

	public int getId() {
		return id;
	}

	public String getIsim() {
		return isim;
	}

	public Date getKayitTarihi() {
		return kayitTarihi;
	}

}
