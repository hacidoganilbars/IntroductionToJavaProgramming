package tr.bolum10.vki;

//UML
/*******************************************
*             VKI                         *    
* -isim: String                           *
* -yas: int                               *
* -genislik: double                       *
* -boy: double                            *
* ----------------------------------------*
* +VKI(isim: String, genislik: double,    *
*   boy: double)                          *
* +VKI(isim: String, yas: int, genislik:  *
*   double, boy: double)                  *
* +getVKI(): double                       *
* +getDurum(): String                     * 
*******************************************/
public class VKI {

	private String isim;
	private int yas;
	private double genislik;
	private double boy;
	
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

	public VKI(String isim, double genislik, double boy) {
		this(isim, 20, genislik, boy);
	}

	public VKI(String isim, int yas, double genislik, double boy) {
		this.isim = isim;
		this.yas = yas;
		this.genislik = genislik;
		this.boy = boy;
	}

	public String getIsim() {
		return isim;
	}

	public int getYas() {
		return yas;
	}

	public double getGenislik() {
		return genislik;
	}

	public double getBoy() {
		return boy;
	}
	
	public double getVKI() {
		double vki=genislik*KILOGRAMS_PER_POUND/((boy*METERS_PER_INCH)*(boy*METERS_PER_INCH));
		return Math.round(vki*100)/100.0;
	}

	public String getDurum() {
		double vki=getVKI();
		if(vki<18.5) {
			return "Dusuk Kilolu";
		}else if(vki<25) {
			return "Normal";
		}else if(vki<30) {
			return "Kilolu";
		}else {
			return "Obezite";
		}	
	}
}
