package tr.bolum10.stringtest;

public class Islem5 {
	public static void main(String[] args) {
		System.out.println("Hi ABC good".matches("ABC "));
		System.out.println("Hi ABC good".matches(".*ABC.*"));
		System.out.println("A,B;C".replaceAll(",;", "#"));
		System.out.println("A,B;C".replaceAll("[,;]", "#"));

		String[] tokens = "A,B;C".split("[,;]");
		for (int i = 0; i < tokens.length; i++) {
			System.out.print(tokens[i] + " ");
		}
	}

}
