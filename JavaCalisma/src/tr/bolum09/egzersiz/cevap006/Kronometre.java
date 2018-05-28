package tr.bolum09.egzersiz.cevap006;
/*******************************
*         Kronometre           *
*------------------------------*
* -baslangicZamani: long       *
* -bitisZamani: long           *
* +Kronometre()                *
* +baslat()                    *
* +dur()                       *
* +getGecenSure(): long        *
* +getBaslangicZamani(): long  *
* +getBitisZamani(): long      *
********************************/
public class Kronometre {
	private long baslangicZamani;
	private long bitisZamani;

	public Kronometre() {
		baslangicZamani = System.currentTimeMillis();
	}

	public void baslat() {
		baslangicZamani = System.currentTimeMillis();
	}

	public void dur() {
		bitisZamani = System.currentTimeMillis();
	}

	public long getGecenSure() {
		return getBitisZamani() - getBaslangicZamani();
	}

	public long getBaslangicZamani() {
		return baslangicZamani;
	}

	public long getBitisZamani() {
		return bitisZamani;
	}
}
