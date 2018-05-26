package tr.bolum02.egzersiz;

import java.util.Scanner;

//q=m*c*sicaklikFarki
//isi sigasi c=4184
public class Cevap010 {
	public static void main(String[] args) {
		int c = 4184;
		Scanner klavye = new Scanner(System.in);
		System.out.print("Kilogram cinsinden su miktarini giriniz(orn=55,5): ");
		double m = klavye.nextDouble();
		System.out.print("Baslangic sicakligini giriniz (orn=3,5): ");
		double t0 = klavye.nextDouble();
		System.out.print("Son sicakligini giriniz (orn=10,5): ");
		double t1 = klavye.nextDouble();
		double q = m * c * (t1 - t0);
		System.out.println("Gereken enerji (q): " + q);// gereken enerji
		klavye.close();
	}

}
