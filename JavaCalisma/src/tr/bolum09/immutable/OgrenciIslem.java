package tr.bolum09.immutable;

import java.util.Date;

public class OgrenciIslem {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci(5, "Hacý Doðan Ýlbars");
		Date kayitTarihi = ogrenci.getKayitTarihi();
		kayitTarihi.setDate(200000);// simdi kayitTarihi degistirildi

		System.out.println("Ogrenci id: " + ogrenci.getId() + "\nOgrenci adi: " + ogrenci.getIsim()
				+ "\nOgrenci Kayit Tarihi: " + ogrenci.getKayitTarihi());
	}
}
