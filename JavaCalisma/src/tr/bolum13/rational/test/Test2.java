package tr.bolum13.rational.test;

import tr.bolum13.rational.Rational;

public class Test2 {
	public static void main(String[] args) {
		Rational r1 = new Rational(-2, 6);
		Object r2 = new Rational(1, 45);
		System.out.println("((Rational)r2).compareTo(r1) is " + ((Rational) r2).compareTo(r1));
		System.out.println("r1.compareTo((Rational) r2) is " + r1.compareTo((Rational) r2));
	}

}
