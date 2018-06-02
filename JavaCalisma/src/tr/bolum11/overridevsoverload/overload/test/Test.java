package tr.bolum11.overridevsoverload.overload.test;

import tr.bolum11.overridevsoverload.overload.a.A;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.p(10);
		a.p(10.0);
	}

}
