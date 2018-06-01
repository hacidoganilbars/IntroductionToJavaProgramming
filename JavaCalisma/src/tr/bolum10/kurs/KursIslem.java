package tr.bolum10.kurs;

public class KursIslem {
	public static void main(String[] args) {

		Kurs kurs1 = new Kurs("Java");
		Kurs kurs2 = new Kurs("Android");

		kurs1.ekleOgrenci("Hacý Doðan Ýlbars");
		kurs1.ekleOgrenci("Sibel mibel");
		kurs1.ekleOgrenci("Ali Veli");
		kurs1.ekleOgrenci("Ayþe Mayþe");
		kurs1.ekleOgrenci("Ozlem mozlem");
		kurs1.kaldirOgrenci("Ali Veli");

		kurs2.ekleOgrenci("Hacý Doðan Ýlbars");
		kurs2.ekleOgrenci("Ziya Miya");

		System.out.println("kurs1'de ogrenci sayisi: " + kurs1.getOgrenciSayisi());

		String[] ogrenciler = kurs1.getOgrenciler();
		for (int i = 0; i < kurs1.getOgrenciSayisi(); i++) {
			System.out.print(ogrenciler[i] + ", ");
		}

		// for (String o : ogrenciler) {
		// System.out.print(o);
		// }

		// System.out.println("\n\nkurs2'de ogrenci sayisi: " +
		// kurs2.getOgrenciSayisi());
	}

}
