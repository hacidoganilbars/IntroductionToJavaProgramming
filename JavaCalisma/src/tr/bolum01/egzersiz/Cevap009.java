package tr.bolum01.egzersiz;

//Dikdortgen cevre ve alan(rectangle)
//genisilik=4.5 , yukseklik= 7.9
//not: double'a guvenme
public class Cevap009 {
	public static void main(String[] args) {

		double genislik = 4.5;
		double yukseklik = 7.9;
		double cevre = 2 * (genislik + yukseklik);
		double alan = genislik * yukseklik;

		System.out.println("Çevre= " + cevre);
		System.out.println("Alana= " + alan);

	}

}
