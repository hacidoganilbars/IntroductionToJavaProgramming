package tr.bolum05;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Bir cümle giriniz: ");
		String cumle = klavye.nextLine();

		boolean palindromMu = true;
		for (int i = 0, j = cumle.length() - 1; i < j; i++, j--) {

			char bastaki = cumle.charAt(i);
			char sondaki = cumle.charAt(j);

			if (bastaki != sondaki) {
				palindromMu = false;
				break;// donmemek icin break yazilir israf :)
			}
		}
		if (palindromMu) {
			System.out.println(cumle + " bir palindrom");
		} else {
			System.out.println(cumle + " bir palindrom deðildir!");
		}
		klavye.close();
	}

}
