package tr.bolum01.egzersiz;

//14 kilometreyi 45 dakika 30 saniyede kosan kosucu'nun mil/saat cinsinden ortalama hizini istiyor
//1mil=1.6km
public class Cevap010 {
	public static void main(String[] args) {

		/*
		 * 14 km 45.5 dakikada ise saatte ka� km (14*60)/45.5 60 dakikada yani 1
		 * saatteki h�z� 1mil=1.6km ise mil cinsinden bulmak i�in 1 saatteki h�z�n�
		 * 1.6ya boleriz
		 */
		System.out.println(((14 * 60) / 45.5) / 1.6);

	}

}
