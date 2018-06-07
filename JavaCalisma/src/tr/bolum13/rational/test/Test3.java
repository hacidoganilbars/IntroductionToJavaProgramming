package tr.bolum13.rational.test;

import tr.bolum13.rational.Rational;

public class Test3 {
public static void main(String[] args) {
	Object r1=new Rational(-2,6);
	Rational r2=new Rational(1,45);
	System.out.println("r2.compareTo((Rational) r1) is "+r2.compareTo((Rational) r1));
	System.out.println("((Rational)r1).compareTo(r2) is "+((Rational)r1).compareTo(r2));
}
}
