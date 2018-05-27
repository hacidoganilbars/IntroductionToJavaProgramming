package tr.bolum03.egzersiz;

import java.util.Scanner;

/*
 * Dogrusal denklemi cozme
 * ax + by = e
 * cx + dy = f
 * 
 * x=(ed - bf)/(ad - bc)
 * y=(af - ec)/(ad - bc)
 * 
 */
public class Cevap003 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		double a = klavye.nextDouble();
		double b = klavye.nextDouble();
		double c = klavye.nextDouble();
		double d = klavye.nextDouble();
		double e = klavye.nextDouble();
		double f = klavye.nextDouble();

		if (a * d - b * c == 0)
			System.out.println("Denklemin cozumu yok.");
		else {
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x: " + x + " dir ve y: " + y + " dir");
		}
		klavye.close();
	}

}
