package tr.bolum10;

public class Okul {
	String[] ogrenciler = new String[100];
	int ogrenciSayisi;

	public int getOgrenciSayisi() {
		return ogrenciSayisi;
	}

	public String[] getOgrenciler() {
		return ogrenciler;
	}

	public void ogrenciEkle(String ogrenci) {
		ogrenciler[ogrenciSayisi] = ogrenci;
		ogrenciSayisi++;
	}

	public void ogrenciCikar(String ogrenci) {
		

		for (int i = 0; i < ogrenciler.length; i++) {
			int index = 0;
			if (ogrenciler[i] == ogrenci) {
				if (i == 0) {
					index = i;
					i = i++;
				} else {
//					index=i;
			
				}
			index++;
			}
			
			ogrenciler[index] = ogrenciler[i];
		}
	}
}
