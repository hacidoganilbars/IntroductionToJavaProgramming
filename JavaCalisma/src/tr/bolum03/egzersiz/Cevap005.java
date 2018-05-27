package tr.bolum03.egzersiz;
/*
 * kullanici konsolda girdigi gunu bugun olarak dusunup
 * uzerine gun sayisi ekledikten sonra o gun gunlerden nedir? 
 * 
 */

import java.util.Scanner;

public class Cevap005 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Gunler 0-6 arasinda tamsayilarla ifade ediliyor");
		System.out.print("Bu gunu giriniz: ");
		int buGun = klavye.nextInt();
		System.out.print("Bu gunden itibaren gecen gun sayisini giriniz: ");
		int gecenGunler = klavye.nextInt();
		int gelecekGun = (buGun + gecenGunler) % 7;
		String gun = "";

		switch (buGun) {
		case 0: gun = "Pazartesi"; break;
		case 1: gun = "Sali"; break;
		case 2: gun = "Carsamba"; break;
		case 3: gun = "Persembe"; break;
		case 4: gun = "Cuma"; break;
		case 5: gun = "Cumartesi"; break;
		case 6: gun = "Pazar"; break;
		}
		System.out.println("Bugun gunlerden " + gun + " ise");

		switch (gelecekGun) {
		case 0: gun = "Pazartesi"; break;
		case 1: gun = "Sali"; break;
		case 2: gun = "Carsamba"; break;
		case 3: gun = "Persembe"; break;
		case 4: gun = "Cuma"; break;
		case 5: gun = "Cumartesi"; break;
		case 6: gun = "Pazar"; break;
		}
		System.out.println(gecenGunler + " gun sonra gunlerden " + gun + " olur");
		
		klavye.close();
	}

}
