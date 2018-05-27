package tr.bolum03.egzersiz;

import java.util.Scanner;

/*
 * Palindrom numara 3 basamaki sayiyi kontrol eder
 * 
 * 121 353 gibi
 * 
 */
public class Cevap012 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Uc basamakli sayi giriniz: ");
		int sayi = klavye.nextInt();

		int yuzler = sayi / 100;
		int birler = sayi % 10;
		if (yuzler == 0) {
			sayi = 0;
		}

		// ayný isi yapar
		// System.out.println(yuzler == birler ? "Palindrome" : "Palindrome degil");
		if (yuzler == birler) {
			System.out.println(sayi + " Palindrome");
		} else {
			System.out.println(sayi + " Palindrome deðil");
		}
		klavye.close();
	}
}
