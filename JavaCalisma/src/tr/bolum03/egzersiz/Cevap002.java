package tr.bolum03.egzersiz;

import java.util.Scanner;

/*Rasgele 3 tam sayi al
 *Uc tane sayinin toplamini sor cevap dogru ise true yanlis ise false donsun
 */
public class Cevap002 {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		int sayi1 = (int) (Math.random() * 10);
		int sayi2 = (int) (Math.random() * 10);
		int sayi3 = (int) (Math.random() * 10);

		System.out.println(sayi1 + " + " + sayi2 + " + " + sayi3 + " = ?");
		System.out.print("Cevabýnýz= ");
		int cevap = klavye.nextInt();

		System.out.println(sayi1 + " + " + sayi2 + " + " + sayi3 + " = " + cevap);
		System.out.println((sayi1 + sayi2 + sayi3) == cevap);// kullanicinin cevabi ile 3 sayinin toplamini
																// karsilastiriyoruz

		klavye.close();

	}

}
