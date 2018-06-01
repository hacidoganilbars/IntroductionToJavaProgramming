package tr.bolum10.kredi;

import java.util.Scanner;

public class KrediIslem {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Yillik Faiz Oranini girin(ornek=8,5): ");
		double yillikFaizOrani = klavye.nextDouble();
		System.out.print("Yil sayisini girin (ornek=3): ");
		int yilSayisi = klavye.nextInt();
		System.out.println("Kredi Turani giriniz(ornek=120000,95):");
		double krediMiktari = klavye.nextDouble();

		Kredi kredi = new Kredi(yillikFaizOrani, yilSayisi, krediMiktari);
		System.out.printf("Kredi %s tarihinde olusuturuldu \nAylik odeme %.2f \nToplam Odeme %.2f",
				kredi.getKrediTarihi(), kredi.getAylikOdeme(), kredi.getToplamOdeme());

		klavye.close();
	}

}
