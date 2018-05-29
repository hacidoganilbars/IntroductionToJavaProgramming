package tr.bolum09.egzersiz.cevap013;

public class Konum {
	int satir;
	int sutun;
	double yuksekDeger;

	Konum(double[][] a) {
		yuksekDeger = a[0][0];
		satir = 0;
		sutun = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > yuksekDeger) {
					yuksekDeger = a[i][j];
					satir = i;
					sutun = j;
				}
			}
		}
	}

}
