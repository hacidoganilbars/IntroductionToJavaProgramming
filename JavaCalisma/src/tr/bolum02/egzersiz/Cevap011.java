package tr.bolum02.egzersiz;

import java.util.Scanner;

/*amerika nufusu=312,032,486
 * 7 saniyede 1 kiþi doguyor
 * 13 saniyede 1 kiþi ölüyor
 * 45 saniyede 1 gocmen
 */
public class Cevap011 {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.print("Kac yil sonra nufusu istiyorsunuz (orn=5): ");
		int yil = klavye.nextInt();

		int nufus = 312032486 + (int) (((31536000 / 7.0) - (31536000 / 13.0) + (31536000 / 45.0)) * yil);

		System.out.println(yil + " yil sonra " + nufus);

		klavye.close();

	}
}
