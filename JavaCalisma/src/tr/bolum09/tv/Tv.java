package tr.bolum09.tv;

public class Tv {

	int kanal = 1;
	int sesSeviyesi = 1;
	boolean acik = false;

	public Tv() {

	}

	public void acmak() {
		acik = true;
	}

	public void kapatmak() {
		acik = false;
	}

	public void setKanal(int yeniKanal) {
		if (acik && 1 <= yeniKanal && yeniKanal <= 120) {
			kanal = yeniKanal;
		}
	}

	public void setSes(int yeniSesSeviyesi) {
		if (acik && 1 <= yeniSesSeviyesi && yeniSesSeviyesi <= 7) {
			sesSeviyesi = yeniSesSeviyesi;
		}
	}

	public void kanalArttir() {
		if (acik && kanal < 120) {
			kanal++;
		}
	}

	public void kanalAzalt() {
		if (acik && kanal > 1) {
			kanal--;
		}
	}

	public void sesArttir() {
		if (acik && sesSeviyesi < 7) {
			sesSeviyesi++;
		}
	}

	public void sesAzalt() {
		if (acik && sesSeviyesi > 1) {
			sesSeviyesi--;
		}
	}

}
