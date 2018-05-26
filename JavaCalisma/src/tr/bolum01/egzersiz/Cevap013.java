package tr.bolum01.egzersiz;

/* 
 *(Km cinsinden ortalama hýz) Bir koþucunun 24 mili 1 saat 40 dakika ve 35 saniyede koþtuðunu varsayalým
 *Ortalama hýzý kilometre cinsinden gösteren bir program yazýnýz.
 *saat. (1 mil 1,6 kilometre olduðunu unutmayýn.)
 */
public class Cevap013 {
	public static void main(String[] args) {
		System.out.println("Mil / (saat + (dakika / 60) + (saniye / 3600)) * 1.6");
		System.out.println("24    / (1    + (40      / 60) + (35      / 3600))  * 1.6");
		System.out.println((24 / (1 + (40 / 60.0) + (35 / 3600.0))) * 1.6);
	}
}
