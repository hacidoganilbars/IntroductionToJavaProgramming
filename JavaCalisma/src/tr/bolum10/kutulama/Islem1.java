package tr.bolum10.kutulama;

public class Islem1 {
	public static void main(String[] args) {

		Integer x1 = 3 + new Integer(5);
		System.out.println("X1: " + x1);

		Integer x2 = 3;
		System.out.println("x2: " + x2);

		// Double x3 = 3;//tamsayi kabul etmez double a donusturmek gerekir
		// System.out.println("x3: "+x3);

		Double x4 = 3.0;
		System.out.println("x4: " + x4);

		int x5 = new Integer(11);
		System.out.println("x5: " + x5);
		int x6 = new Integer(3) + new Integer(4);
		System.out.println("x6: " + x6);
	}

}
