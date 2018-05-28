package tr.bolum09.egzersiz.cevap003;

import java.util.Date;

public class TarihNesnesi {
	public static void main(String[] args) {

		Date tarih = new Date();

		System.out.println("\nSirasiyla gecen sureler icin tarihler ve saatler 10000, "
				+ "100000, 1000000, 10000000,\n100000000, 1000000000, 10000000000," + " and 100000000000");
		for (long i = 10000; i <= 1e11; i *= 10) {
			tarih.setTime(i);
			System.out.println(tarih.toString());

		}
	}

}
