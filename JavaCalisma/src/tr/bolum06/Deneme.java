package tr.bolum06;

public class Deneme {
	public static void main(String[] args) {
		String mesaj = "Selam";
		int n = 5;

		sayidaEkranaMesajYaz(n, mesaj);
	}

	private static void sayidaEkranaMesajYaz(int n, String mesaj) {
		for (int i = 0; i < n; i++) {
			System.out.println(i + " " + mesaj);
		}
	}

}
