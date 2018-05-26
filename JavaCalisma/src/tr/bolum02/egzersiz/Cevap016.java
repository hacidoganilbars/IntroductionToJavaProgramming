package tr.bolum02.egzersiz;

import java.util.Scanner;

//altigen alan bulma
public class Cevap016 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Duzgun altigenin alanini bulan program");
		System.out.print("Duzgun altigenin bir kenarini giriniz: ");
		double kenar = klavye.nextDouble();

		double alan = (int) (3 * Math.sqrt(3) / 2 * Math.pow(kenar, 2) * 10000) / 10000.0;
		System.out.println(alan);
		// double alan=((3 * Math.pow(3, 0.5)) / 2) * Math.pow(kenar, 2);

		klavye.close();

	}

}
