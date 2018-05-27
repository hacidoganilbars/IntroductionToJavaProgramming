package tr.bolum03.egzersiz;

import java.util.Scanner;

public class Cevap011 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.print("Ay'ý tamsayi olarak girin: ");
		int ay = klavye.nextInt();
		System.out.print("Yili tamsayi olarak girin: ");
		int yil = klavye.nextInt();

		boolean artikYilMi = (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);

		switch (ay) {
		case 1:
			System.out.println("Ocak " + yil + " 31 gun");
			break;
		case 2:
			System.out.println("Subat " + yil + " " + ((artikYilMi) ? " 29 gun" : " 28 gun"));
			break;
		case 3:
			System.out.println("Mart " + yil + " 31 gun");
			break;
		case 4:
			System.out.println("Nisan " + yil + " 30 gun");
			break;
		case 5:
			System.out.println("Mayis " + yil + " 31 gun");
			break;
		case 6:
			System.out.println("Haziran " + yil + " 30 gun");
			break;
		case 7:
			System.out.println("Temmuz " + yil + " 31 gun");
			break;
		case 8:
			System.out.println("Agustos " + yil + " 31 gun");
			break;
		case 9:
			System.out.println("Eylul " + yil + " 30 gun");
			break;
		case 10:
			System.out.println("Ekim " + yil + " 31 gun");
			break;
		case 11:
			System.out.println("Kasim " + yil + " 30 gun");
			break;
		case 12:
			System.out.println("Aralik " + yil + " 31 gun");
		}
		klavye.close();
	}

}
