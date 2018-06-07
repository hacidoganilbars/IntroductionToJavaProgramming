package tr.bolum13.rational.test;

import tr.bolum13.rational.Rational;

public class Test1 {
	public static void main(String[] args) {
		Rational r1 = new Rational(-2, 6);
		System.out.println("r1.getNumerator() is " + r1.getNumerator());
		System.out.println("r1.getDenominator() is " + r1.getDenominator());
		System.out.println("r1.intValue() is " + r1.intValue());
		System.out.println("r1.doubleValue() is " + r1.doubleValue());
	}

}
