package tr.bolum09.statik;

public class StatikUyelerIleDaireIslem {
	public static void main(String[] args) {
		System.out.println("Nesneleri yaratmadan once");
		System.out.println("Daire nesnelerinin sayisi: " + StatikUyelerIleDaire.nesnelerinSayisi);// statik degisken

		// daire1 olusturuldu
		StatikUyelerIleDaire daire1 = new StatikUyelerIleDaire();
		System.out.println("\nONCE daire1 ");
		System.out.println("daire1: yariCap(" + daire1.yariCap + ") ve daire nesnelerinin sayisi("
				+ daire1.nesnelerinSayisi + ")");

		// daire2 olusturuldu
		StatikUyelerIleDaire daire2 = new StatikUyelerIleDaire(5);

		// daire1'in yaricapini degistirdik
		daire1.yariCap = 9;
		System.out.println("\nSONRA daire1 yaricap degistirildi");
		System.out.println("daire1: yariCap(" + daire1.yariCap + ") ve daire nesnelerinin sayisi("
				+ daire1.nesnelerinSayisi + ")");

		System.out.println("\n daire2");
		System.out.println("daire1: yariCap(" + daire2.yariCap + ") ve daire nesnelerinin sayisi("
				+ daire2.nesnelerinSayisi + ")");

		// yeni nesne olusturulmadigi icin sayi degismez
		System.out.println(daire2.getNesnelerinSayisi());

	}

}
