package tr.bolum01.egzersiz;

/* 
 *(Km cinsinden ortalama h�z) Bir ko�ucunun 24 mili 1 saat 40 dakika ve 35 saniyede ko�tu�unu varsayal�m
 *Ortalama h�z� kilometre cinsinden g�steren bir program yaz�n�z.
 *saat. (1 mil 1,6 kilometre oldu�unu unutmay�n.)
 */
public class Cevap013 {
	public static void main(String[] args) {
		System.out.println("Mil / (saat + (dakika / 60) + (saniye / 3600)) * 1.6");
		System.out.println("24    / (1    + (40      / 60) + (35      / 3600))  * 1.6");
		System.out.println((24 / (1 + (40 / 60.0) + (35 / 3600.0))) * 1.6);
	}
}
