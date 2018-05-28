package tr.bolum09.nesnedizisi;

public class DaireAlanIslem {
	public static void main(String[] args) {
		DaireAlan[] daireArray;
		daireArray = daireArrayOlustur();
		daireArrayGoster(daireArray);

	}

	public static DaireAlan[] daireArrayOlustur() {
		DaireAlan[] daireAlan = new DaireAlan[5];
		for (int i = 0; i < daireAlan.length; i++) {
			daireAlan[i] = new DaireAlan(Math.random() * 100);
		}
		return daireAlan;
	}

	public static void daireArrayGoster(DaireAlan[] daireArray) {
		System.out.printf("%-30s%-15s\n", "YariCap", "Alan");
		for (int i = 0; i < daireArray.length; i++) {
			System.out.printf("%-30s%-15s\n", daireArray[i].getYariCap(), daireArray[i].getAlan());
		}
		System.out.println("---------------------------------------------------------");
		System.out.printf("%-30s%-15f\n", "Dairelerin toplam alani", toplamAlan(daireArray));
	}

	public static double toplamAlan(DaireAlan[] daireArray) {
		double toplam = 0;
		for (int i = 0; i < daireArray.length; i++) {
			toplam += daireArray[i].getAlan();
		}
		return toplam;
	}
}
