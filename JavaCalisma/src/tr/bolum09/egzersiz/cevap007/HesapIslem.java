package tr.bolum09.egzersiz.cevap007;

public class HesapIslem {
	public static void main(String[] args) {

		Hesap hesap = new Hesap(1122, 20000);

		hesap.setYillikFaizOrani(4.5);

		hesap.paraCek(2500);

		hesap.paraYatir(3000);

		System.out.println("            Hesap Ekstresi\n-----------------------------------------------------");
		System.out.println("Hesap id: " + hesap.getId());
		System.out.println("Kayit Tarihi: " + hesap.getOlusturmaTarihi());
		System.out.printf("Bakiye: %.2ftl\n", hesap.getBakiye());
		System.out.printf("Aylik Faiz %.2ftl\n", hesap.getAylikFaiz());
	}

}
