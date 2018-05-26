package tr.bolum02.egzersiz;

import java.util.Scanner;

//pound'u kilograma donustur
//1 pound 0.454 kilograms
public class Cevap004 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Pound Degerini giriniz: ");
		double pound = klavye.nextDouble();

		double kilograms = pound * 0.454;

		System.out.println(pound + " pound " + kilograms + "kilogram dýr");

		klavye.close();
	}

}
