package tr.bolum02.egzersiz;

import java.util.Scanner;

/*
(Geometri: iki noktan�n uzakl���) Kullan�c�n�n girmesini isteyen bir program yaz
iki nokta (x1, y1) ve (x2, y2) ve aralar�ndaki mesafeyi g�sterir.
Mesafeyi hesaplamak i�in form�l kok i�erisinde (x2 - x1)^2  + (y2 - y1)^2 dir
 */
public class Cevap015 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Kordinat sisteminde 2 noktan�n uzkaligini bulan program");
		System.out.print("x1 ve y1 degerlerini giriniz: ");
		double x1 = klavye.nextDouble();
		double y1 = klavye.nextDouble();
		System.out.print("x2 ve y2 degerlerini giriniz: ");
		double x2 = klavye.nextDouble();
		double y2 = klavye.nextDouble();

		double mesafe = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

		System.out.println("Iki nokta arasindaki mesafe: " + mesafe);
		klavye.close();
	}

}
