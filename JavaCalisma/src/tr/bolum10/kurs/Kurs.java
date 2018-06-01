package tr.bolum10.kurs;

//UML
/************************************************
 * KURS * ______________________________________________* * -kursAdi: String *
 * -ogrenciler: String[] * -ogrenciSayisi: int *
 * ______________________________________________* * +Kurs(kursAdi: String) *
 * +getKursAdi(): String * +ekleOgrenci(String ogrenci: String): void *
 * +kaldirOgrenci(String ogrenci): void * +getOgrenciler(): String[] *
 * +getOgrenciNumarasi(): int *
 ************************************************/
public class Kurs {
	private String kursAdi;
	private String[] ogrenciler = new String[100];
	private int ogrenciSayisi;

	public Kurs(String kursAdi) {
		this.kursAdi = kursAdi;
	}

	public String getKursAdi() {
		return kursAdi;
	}

	public void ekleOgrenci(String ogrenci) {
		ogrenciler[ogrenciSayisi] = ogrenci;
		ogrenciSayisi++;
	}

	public int getOgrenciSayisi() {
		return ogrenciSayisi;
	}

	public String[] getOgrenciler() {
		return ogrenciler;
	}

	public void kaldirOgrenci(String ogrenci) {
		String[] ogrencilerim = getOgrenciler();
		int index = 0;
		for (int i = 0; i < getOgrenciSayisi(); i++) {
			if (ogrenciler[i] == ogrenci) {
				index = i;
			}
			if (ogrenciler[i] != ogrenci) {
				this.ogrenciler[i - index] = ogrencilerim[i];
			}
		}
		ogrenciSayisi--;

	}
}
