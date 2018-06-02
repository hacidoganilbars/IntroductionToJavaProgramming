package tr.bolum11.overridevsoverload.override.test;

import tr.bolum11.overridevsoverload.override.a.A;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.p(10);
		a.p(10.0);
	}

}
