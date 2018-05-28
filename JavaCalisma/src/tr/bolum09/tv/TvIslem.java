package tr.bolum09.tv;

public class TvIslem {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.acmak();
		tv1.setKanal(30);
		tv1.setSes(3);

		Tv tv2 = new Tv();
		tv2.acmak();// dikkat acmasaydik kanal numarasi 1 ses seviyesi 1 olurdu
		tv2.kanalArttir();
		tv2.kanalArttir();
		tv2.kanalArttir();
		tv2.sesArttir();

		System.out.println("tv1'de izlenen kanal numarasi: " + tv1.kanal + " ve ses seviyesi: " + tv1.sesSeviyesi);
		System.out.println("tv1'de izlenen kanal numarasi: " + tv2.kanal + " ve ses seviyesi: " + tv2.sesSeviyesi);
	}

}
