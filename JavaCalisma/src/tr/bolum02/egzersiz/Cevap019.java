package tr.bolum02.egzersiz;

import java.util.Scanner;

/*
 * Kordinat duzleminde belirtilen 3 noktanin olusturdugu ucgenin alani
 * 
 * 
 */
public class Cevap019 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Kordinat duzleminde alani bulunacak ucgenin 3 noktasini (x,y) ikilileri þeklinde giriniz ");
		System.out.println("x1 ve y1 noktalarini giriniz: ");
		double x1 = klavye.nextDouble();
		double y1 = klavye.nextDouble();
		System.out.println("x2 ve y2 noktalarini giriniz: ");
		double x2 = klavye.nextDouble();
		double y2 = klavye.nextDouble();
		System.out.println("x3 ve y3 noktalarini giriniz: ");
		double x3 = klavye.nextDouble();
		double y3 = klavye.nextDouble();

		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);

		double s = (side1 + side2 + side3) / 2;

		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		System.out.println("Alan= " + ((int) (area * 10) / 10.0));
		klavye.close();
	}

}
