package tr.bolum09.egzersiz.cevap011;

import java.util.Scanner;

public class DogrusalDenklemlerIslem {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		double a = klavye.nextDouble();
		double b = klavye.nextDouble();
		double c = klavye.nextDouble();
		double d = klavye.nextDouble();
		double e = klavye.nextDouble();
		double f = klavye.nextDouble();

		DogrusalDenklemler denklem = new DogrusalDenklemler(a, b, c, d, e, f);

		if (denklem.isHalledilebilirMi()) {
			System.out.println("x = " + denklem.getX());
			System.out.println("y = " + denklem.getY());
		} else {
			System.out.println("denklemin cozumu yoktur");
		}
		klavye.close();
	}

}
