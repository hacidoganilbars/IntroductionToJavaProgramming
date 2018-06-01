package tr.bolum10;

public class OkulIslem {
	public static void main(String[] args) {
		Okul okul = new Okul();
		okul.ogrenciEkle("Ahmet");
		okul.ogrenciEkle("Bahtiyar");
		okul.ogrenciEkle("Gamze");
		okul.ogrenciEkle("Özlem");
		okul.ogrenciEkle("Þifa");
		okul.ogrenciEkle("Hasan");
		okul.ogrenciEkle("Leyla");
		okul.ogrenciEkle("Ayþe");
		okul.ogrenciCikar("Ahmet");
		okul.ogrenciCikar("Bahtiyar");
		

		String[] ogrenciler = okul.getOgrenciler();
	System.out.println(ogrenciler[0]);
		for (int i = 0; i < okul.ogrenciSayisi; i++) {
			System.out.print(ogrenciler[i] + ", ");
			
		}

	}

}
