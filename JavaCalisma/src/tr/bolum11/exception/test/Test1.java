package tr.bolum11.exception.test;

public class Test1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
			try {
				System.out.println(1 / 0);
			} catch (Exception ex) {
				// System.out.println(ex);
			}
		}
	}

}
