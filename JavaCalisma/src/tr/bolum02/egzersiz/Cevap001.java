package tr.bolum02.egzersiz;

import java.util.Scanner;

public class Cevap001 {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.print("Celcius= ");
		int celcius = klavye.nextInt();

		// dikkat 9.0 degeri olmasa sonuc cok farklý olur
		double fahrenheit = (9.0 / 5) * celcius + 32;
		System.out.print("Fahrenheit= " + fahrenheit);

		klavye.close();
	}

}
