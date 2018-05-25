package tr.bolum01.egzersiz;

//cemberde alan ve cevre tabi yaricapi=5.5
public class Cevap008 {
	public static void main(String[] args) {

		double yariCap = 5.5;
		
		// pi sayisi
		double pi = Math.PI;

		// (cevre) perimeter = 2 * radius * p
		double cevre = 2 * yariCap * pi;

		// (alan) area = radius * radius * p
		double alan = yariCap * yariCap * pi;
		System.out.println("Cevre= " + cevre);
		System.out.println("Alan= " + alan);
	}

}
