package tr.bolum12.file.webcrawler;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebGezgini {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Bir URL giriniz: ");
		String url = klavye.nextLine();
		gezgin(url);
		klavye.close();
	}

	public static void gezgin(String baslangicURL) {
		ArrayList<String> bekleyenURLler = new ArrayList<String>();
		ArrayList<String> tarananURLler = new ArrayList<String>();
		bekleyenURLler.add(baslangicURL);

		while (!bekleyenURLler.isEmpty() && tarananURLler.size() <= 100) {
			String urlString = bekleyenURLler.remove(0);
			if (!tarananURLler.contains(urlString)) {
				tarananURLler.add(urlString);
				System.out.println("Gezinen: " + urlString);
				for (String s : getAltURLler(urlString)) {
					if (!tarananURLler.contains(s)) {
						bekleyenURLler.add(s);
					}
				}
			}
		}
	}

	public static ArrayList<String> getAltURLler(String urlString) {
		ArrayList<String> liste = new ArrayList<String>();
		try {
			URL url = new URL(urlString);
			Scanner klavye = new Scanner(url.openStream());
			int simdiki = 0;
			while (klavye.hasNext()) {
				String sira = klavye.nextLine();
				simdiki = sira.indexOf("http:", simdiki);
				while (simdiki > 0) {
					int sonIndeks = sira.indexOf("\"", simdiki);
					if (sonIndeks > 0) {
						liste.add(sira.substring(simdiki, sonIndeks));
						simdiki = sira.indexOf("http:", sonIndeks);
					} else {
						simdiki = -1;
					}
				}
			}
			klavye.close();
		} catch (Exception ex) {
			System.out.println("Hata: " + ex.getMessage());
		}
		return liste;
	}
}
