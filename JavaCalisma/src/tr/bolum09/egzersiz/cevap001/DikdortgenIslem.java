package tr.bolum09.egzersiz.cevap001;

public class DikdortgenIslem {
	public static void main(String[] args) {
		Dikdortgen dikdortgen1 = new Dikdortgen(40, 4);
		System.out.println("dikdortgen1 yukseklik: " + dikdortgen1.getYukseklik());
		System.out.println("dikdortgen1 genislik: " + dikdortgen1.getGenislik());
		System.out.println("dikdortgen1 cevre: " + dikdortgen1.cevre());
		System.out.println("dikdortgen1 alan: " + dikdortgen1.getAlan());

		System.out.println("====================================================");

		Dikdortgen dikdortgen2 = new Dikdortgen(35.9, 3.5);
		System.out.println("dikdortgen2 yukseklik: " + dikdortgen2.getYukseklik());
		System.out.println("dikdortgen2 genislik: " + dikdortgen2.getGenislik());
		System.out.println("dikdortgen2 cevre: " + dikdortgen2.cevre());
		System.out.println("dikdortgen2 alan: " + dikdortgen2.getAlan());

		// System.out.println("====================================================");
		//
		// Dikdortgen dikdortgen3 = new Dikdortgen();
		// System.out.println("dikdortgen3 yukseklik: " + dikdortgen3.getYukseklik());
		// System.out.println("dikdortgen3 genislik: " + dikdortgen3.getGenislik());
		// System.out.println("dikdortgen3 cevre: " + dikdortgen3.cevre());
		// System.out.println("dikdortgen3 alan: " + dikdortgen3.getAlan());

	}

}
