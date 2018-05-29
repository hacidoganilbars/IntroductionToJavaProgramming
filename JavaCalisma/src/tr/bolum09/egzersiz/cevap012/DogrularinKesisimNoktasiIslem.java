package tr.bolum09.egzersiz.cevap012;

import java.util.Scanner;

public class DogrularinKesisimNoktasiIslem {
	public static void main(String[] args) {

		System.out.print("x1, y1, x2, y2, x3, y3, x4, y4'u gir: ");
		double[][] points = getNoktalar();

		// Get a, b, c, d, e and f
		double[] p = getArgumanlar(points);

		// Create a LinearEquation object
		DogrusalDenklem kesisenNokta = new DogrusalDenklem(p[0], p[1], p[2], p[3], p[4], p[5]);

		// Display results
		if (kesisenNokta.isHalledilebilirMi()) {
			System.out.println("Kesisen noktasi (" + kesisenNokta.getX() + ", " + kesisenNokta.getY() + ")");
		} else
			System.out.println("Paralel dogrulardir");
	}

	public static double[][] getNoktalar() {

		Scanner klavye = new Scanner(System.in);
		double[][] points = new double[4][2];

		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = klavye.nextDouble();
			}
		}
		klavye.close();
		return points;
	}

	public static double[] getArgumanlar(double[][] points) {
		double[] p = new double[6];
		p[0] = points[0][1] - points[1][1];
		p[1] = -1 * (points[0][0] - points[1][0]);
		p[2] = points[2][1] - points[3][1];
		p[3] = -1 * (points[2][0] - points[3][0]);
		p[4] = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
		p[5] = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
		return p;

	}

}
