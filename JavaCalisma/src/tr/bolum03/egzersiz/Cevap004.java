package tr.bolum03.egzersiz;

/*
 * 
 * Rasgele ay gosteren program
 */
public class Cevap004 {
	public static void main(String[] args) {
		int ay = (int) (Math.random() * 12 + 1);
		String ayIsim;
		switch (ay) {
		case 1: ayIsim = "Ocak"; break;
		case 2: ayIsim = "Subat"; break;
		case 3: ayIsim = "Mart"; break;
		case 4: ayIsim = "Nisan"; break;
		case 5: ayIsim = "Mayis"; break;
		case 6: ayIsim = "Haziran"; break;
		case 7: ayIsim = "Temmuz"; break;
		case 8: ayIsim = "Agustos"; break;
		case 9: ayIsim = "Eylul"; break;
		case 10:ayIsim = "Ekim"; break;
		case 11:ayIsim = "Kasim"; break;
		default:ayIsim = "Aralik"; break;
	    }
		System.out.println(ay + ".ay " + ayIsim);
	}

}
