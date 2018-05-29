package tr.bolum09.egzersiz.cevap011;
//UML diagram
/*******************************************************
*                  DogruslaDenklemler                  *
*------------------------------------------------------*
* -a: double                                           *
* -b: double                                           *
* -c: double                                           *
* -d: double                                           *
* -e: double                                           *
* -f: double                                           *
* +DogruslaDenklemler(a: double, b: double, c: double, * 
*                 d: double, e: double, f: double)     *
* +getA(): double                                      *
* +getB(): double                                      *
* +getC(): double                                      *
* +getD(): double                                      *
* +getE(): double                                      *
* +getF(): double                                      *
* +isHalledilebilirMi(): boolean                       *
* getX(): double                                       *
* getY(): double                                       *
********************************************************/

public class DogrusalDenklemler {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	public DogrusalDenklemler(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public double getA() {
		return this.a;
	}

	public double getB() {
		return this.b;
	}

	public double getC() {
		return this.c;
	}

	public double getD() {
		return this.d;
	}

	public double getE() {
		return this.e;
	}

	public double getF() {
		return this.f;
	}

	public boolean isHalledilebilirMi() {
		return (a * d - b * c) != 0;
	}

	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}

	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}

}
