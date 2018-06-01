package tr.bolum10.stringtest;

public class Islem2 {
	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "welcome";
		s2 = s1.replaceAll("e", "E");
		System.out.println(s2);

		String tokens = "Welcome to Java and HTML";
		tokens = tokens.replace("Welcome", s1);
		System.out.println(tokens);
		tokens = tokens.replace("Welcome", s2);
		System.out.println(tokens);

	}

}
