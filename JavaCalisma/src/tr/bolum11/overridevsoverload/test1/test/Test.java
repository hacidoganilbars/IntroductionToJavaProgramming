package tr.bolum11.overridevsoverload.test1.test;

import tr.bolum11.overridevsoverload.test1.b.B;

public class Test {
	public static void main(String[] args) {
		B b = new B(3, 3);
		System.out.println(b.getArea());
	}

}
