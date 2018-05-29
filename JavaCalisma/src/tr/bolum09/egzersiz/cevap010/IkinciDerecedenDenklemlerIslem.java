package tr.bolum09.egzersiz.cevap010;

import java.util.Scanner;

public class IkinciDerecedenDenklemlerIslem {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("ax^2 + bx + c = 0 ikinci dereceden denklemi olustur");
		System.out.print("a, b, c'yi giriniz: ");
		double a = klavye.nextDouble();
		double b = klavye.nextDouble();
		double c = klavye.nextDouble();

		IkinciDerecedenDenlemler denklem = new IkinciDerecedenDenlemler(a, b, c);

		if (denklem.getDiskriminant() < 0) {
			System.out.println("Gercel kok yok");
		} else if (denklem.getDiskriminant() > 0) {
			System.out.println(
					"iki koku var. Bunlar: " + denklem.getBirinciKok() + " ve " + denklem.getIkinciKok() + " dirler");
		} else {
			System.out.println("Tek koku var. Bu: "
					+ (denklem.getBirinciKok() > 0 ? denklem.getBirinciKok() : denklem.getBirinciKok()) + " dir");
		}
		klavye.close();
	}
}
