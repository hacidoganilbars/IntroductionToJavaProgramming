package tr.bolum13.rational.test;

import tr.bolum13.rational.Rational;

public class Test4 {
	public static void main(String[] args) {
		Rational r1 = new Rational(1, 2);
		Rational r2 = new Rational(1, -2);
		System.out.println("r1.add(r2) is " + r1.add(r2));
	}
}
