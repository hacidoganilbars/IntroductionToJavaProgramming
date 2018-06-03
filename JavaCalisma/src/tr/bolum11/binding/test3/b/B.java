package tr.bolum11.binding.test3.b;

import tr.bolum11.binding.test3.a.A;

public class B extends A {
	public B() {
		System.out.println("i from B is: " + i);
	}

	public void setI(int i) {
		this.i = 3 * i;
	}
}
