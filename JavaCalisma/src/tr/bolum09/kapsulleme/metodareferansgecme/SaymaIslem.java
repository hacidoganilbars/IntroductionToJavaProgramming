package tr.bolum09.kapsulleme.metodareferansgecme;

public class SaymaIslem {
	public static void main(String[] args) {
		Sayma sayiyorum = new Sayma();
		int kere = 0;

		for (int i = 0; i < 100; i++) {
			arttir(sayiyorum, kere);
		}
		System.out.println("sayiyorum: " + sayiyorum.say);// 101
		System.out.println("kere: " + kere);// 0
	}

	public static void arttir(Sayma s, int kere) {
		s.say++;
		kere++;
	}
}
