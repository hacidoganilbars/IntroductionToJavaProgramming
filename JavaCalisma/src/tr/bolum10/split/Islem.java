package tr.bolum10.split;

public class Islem {
	public static void main(String[] args) {
		String[] tokens = "Java,C?C#,C++".split("[.,:;?]");

		for (int i = 0; i < tokens.length; i++) {
			System.out.println("tokens[" + i + "] = " + tokens[i]);
		}
		// for (String s : tokens) {
		// System.out.println(s);
		// }
	}
}
