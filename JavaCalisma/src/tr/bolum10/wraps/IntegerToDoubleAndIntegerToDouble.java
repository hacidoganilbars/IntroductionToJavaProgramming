package tr.bolum10.wraps;

public class IntegerToDoubleAndIntegerToDouble {
	public static void main(String[] args) {
		Integer sayi1 = new Double(12.7).intValue();
		System.out.println("sayi1: " + sayi1);

		Double sayi2 = new Integer((int) 12.0).doubleValue();
		System.out.println("sayi2: " + sayi2);
	}

}
