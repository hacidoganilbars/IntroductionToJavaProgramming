package tr.bolum09.egzersiz.cevap002;

public class HisseSenediIslem {
	public static void main(String[] args) {
		HisseSenedi hisseSenedi = new HisseSenedi("ORCL", "Oracle Corparation");
		hisseSenedi.setOncekiKapanisFiyati(34.5);
		hisseSenedi.setMevcutFiyat(34.35);
		System.out.println("Hisse Senedi Sembolu: " + hisseSenedi.getSembol());
		System.out.println("Hisse Senedi Adi: " + hisseSenedi.getIsim());
		System.out.printf("Fiyat Degisim Yuzdesi: %.2f%%", hisseSenedi.getDegisimYuzdesi());
	}
}
