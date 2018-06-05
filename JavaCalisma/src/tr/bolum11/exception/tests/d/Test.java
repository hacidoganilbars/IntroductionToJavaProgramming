package tr.bolum11.exception.tests.d;

// java.lang.ClassCastException:
public class Test {
	public static void main(String[] args) {
		Object o = new Object();
		
		String s = (String) o;
		System.out.println(s);
	}
}
