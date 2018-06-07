package tr.bolum12.test;

public class Test4 {
	public static void main(String[] args) {
		try {
			method();
			System.out.println("After the method call");
		} catch (ArithmeticException ex) {
			System.out.println("AritmeticException");
		} catch (RuntimeException ex) {
			System.out.println("RunTimeException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

	private static void method() throws Exception {
		System.out.println(1 / 0);
	}

}
