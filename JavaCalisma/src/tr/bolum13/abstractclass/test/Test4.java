package tr.bolum13.abstractclass.test;

public class Test4 {
	public static void main(String[] args) {
		Number x = new Integer(3);
		System.out.println(x.intValue());
		System.out.println(((Integer) x).compareTo(new Integer(4)));
	}
}
