package tr.bolum09.statik;

import tr.bolum09.daire.Daire;

public class C {
	public static void main(String[] args) {
		C x = new C();
		x.method1();
		
	}

	public void method1() {
		method2();	
	}

	public static void method2() {
		System.out.println("Yari capi nedir "+c.getYariCap());
	}

	static Daire c = new Daire(5);
}