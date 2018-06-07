package tr.bolum13.abstractclass.test;

public class Test1 {
	public static void main(String[] args) {
		Number numberRef = new Integer(0);
		Double doubleRef = (Double) numberRef;// numberRef.doubleValue();
		System.out.println(doubleRef);
	}
}
